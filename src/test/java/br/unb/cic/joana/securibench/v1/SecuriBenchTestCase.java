package br.unb.cic.joana.securibench.v1;

import br.unb.cic.joana.JoanaTestCase;
import br.unb.cic.joana.Metrics;
import org.junit.Assert;
import org.junit.Test;
import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner;
import securibench.v1.micro.MicroTestCase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public abstract class SecuriBenchTestCase extends JoanaTestCase {

    @Override
    public String configurationFile() {
        return "securibench.yaml";
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

        Metrics m = Metrics.getInstance();

        for (Class c: classes) {
            Object instance = c.newInstance();

            if (! (instance instanceof MicroTestCase)) {
                throw new RuntimeException("Could not instantiate " + c.getName() + " as a MicroTestCase");
            }

            MicroTestCase microTestCase = (MicroTestCase) instance;
            int expected = microTestCase.getVulnerabilityCount();
            int found = 0;
            
            try {
                setUpConfiguration(c.getName() + "." + entryPointMethod());
                found = driver.execute().size();
            } catch(Throwable e) {
                report.add(String.format("- %s failure to execute. Error = %s", c.getName(), e));
                failure = true;
            }

            m.compute(expected, found);
        }

        Collections.sort(report);
        for(String s: report) {
            System.out.println(s);
        }

        if (m.vulnerabilitiesFound() == m.vulnerabilities()) {
            System.err.println(String.format("Found %d warnings.", m.vulnerabilitiesFound()));
            Assert.assertTrue(true);
        }
        else {
            System.err.println(String.format("Error. Expecting %d but found %d warnings.", m.vulnerabilities(), m.vulnerabilitiesFound()));
        }

        System.out.println(String.format("precision = %.2f recall = %.2f fScore = %.2f", m.precision(), m.recall(), m.f1Score()));

        if (failure) {
            System.err.println("We found errors in the Joana execution or configuration.");
        }

        System.out.println(
            String.format(
                "failed: = %d, passed: = %d of = %d tests.",
                m.failedTests,
                m.passedTests,
                (m.passedTests + m.failedTests)
                )
            );

        System.out.println(
            String.format(
                "Pass Rate: = %.2f",
                m.passRate()
                )
            );

        System.out.println(
            String.format(
                "TP = %.2f",
                m.truePositives
                )
            );

        System.out.println(
            String.format(
                "FP = %.2f",
                m.falsePositives
                )
            );

        System.out.println(
            String.format(
                "FN = %.2f",
                m.falseNegatives
                )
            );

        System.out.println(
            String.format(
                "TN = %.2f",
                m.trueNegatives
                )
            );
    }

}
