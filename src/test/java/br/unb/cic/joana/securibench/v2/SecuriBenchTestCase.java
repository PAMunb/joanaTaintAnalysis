package br.unb.cic.joana.securibench.v2;

import br.unb.cic.joana.JoanaTestCase;
import br.unb.cic.joana.Metrics;
import org.junit.Assert;
import org.junit.Test;
import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner;
import securibench.v2.micro.MicroTestCase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public abstract class SecuriBenchTestCase extends JoanaTestCase {

    @Override
    public String configurationFile() {
        return "securibench_v2.yaml";
    }

    public abstract String entryPointMethod();

    public abstract String basePackage();

    protected Set<Class<? extends MicroTestCase>> findClassesInBasePackage() {
        Reflections reflections = new Reflections(basePackage(), new SubTypesScanner(false));
        return reflections.getSubTypesOf(MicroTestCase.class).stream().collect(Collectors.toSet());
    }

    @Test
    public final void testSuite() throws Exception {
        Set<Class<? extends MicroTestCase>> classes = findClassesInBasePackage();

        List<String> report = new ArrayList<>();
        boolean failure = false;

        br.unb.cic.joana.MetricsManager metricsManager = new br.unb.cic.joana.MetricsManager();

        for (Class c : classes) {
            Object instance = c.newInstance();

            if (!(instance instanceof MicroTestCase)) {
                throw new RuntimeException("Could not instantiate " + c.getName() + " as a MicroTestCase");
            }

            MicroTestCase microTestCase = (MicroTestCase) instance;
            int expected = microTestCase.getVulnerabilityCount();
            int found = 0;
            String testName = c.getName();

            try {
                setUpConfiguration(testName + "." + entryPointMethod());
                found = driver.execute().size();
            } catch (Throwable e) {
                report.add(String.format("- %s failure to execute. Error = %s", testName, e));
                failure = true;
            }

            metricsManager.compute(testName, expected, found);

            if (expected == found) {
                report.add(String.format(" - %s (ok)", testName));
            } else {
                report.add(String.format("- %s error. Expecting %d but found %d vulnerabilities.", testName, expected, found));
            }
        }

        Collections.sort(report);
        for (String s : report) {
            System.out.println(s);
        }

        if (metricsManager.vulnerabilities() == metricsManager.vulnerabilitiesFound()) {
            System.err.println(String.format("Found %d warnings.", metricsManager.vulnerabilitiesFound()));
            Assert.assertTrue(true);
        } else {
            System.err.println(String.format("Error. Expecting %d but found %d warnings.", metricsManager.vulnerabilities(), metricsManager.vulnerabilitiesFound()));
        }

        System.out.println(String.format("precision = %.2f recall = %.2f fScore = %.2f",
                metricsManager.precision(), metricsManager.recall(), metricsManager.f1Score()));

        if (failure) {
            System.err.println("We found errors in the Joana execution or configuration.");
        }

        metricsManager.reportSummary();
    }

}
