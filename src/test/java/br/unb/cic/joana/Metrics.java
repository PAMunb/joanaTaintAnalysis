package br.unb.cic.joana;

public class Metrics {

    private static Metrics instance;

    public double truePositives;
    public double falsePositives;
    public double falseNegatives;
    public double trueNegatives;
    public int passedTests;
    public int failedTests;
    public int expected;
    public int found;

    private Metrics() {
        this.truePositives = 0.0;
        this.falsePositives = 0.0;
        this.falseNegatives = 0.0;
        this.trueNegatives = 0.0;
        this.passedTests = 0;
        this.failedTests = 0;
        this.expected = 0;
        this.found = 0;
    }

    public static Metrics getInstance() {
        if (instance == null) {
            instance = new Metrics();
        }
        return instance;
    }

    public void reportTruePositives(int truePositives) {
        this.truePositives += truePositives;
    }
    public void reportFalsePositives(int falsePositives) {
        this.falsePositives += falsePositives;
    }

    public void reportFalseNegatives(int falseNegatives) {
        this.falseNegatives += falseNegatives;
    }

    public void reportTrueNegatives() {
        this.trueNegatives += 1;
    }

    public void reportPassedTest() {
        this.passedTests += 1;
    }

    public void reportFailedTest() {
        this.failedTests += 1;
    }

    public void reportExpected(int expected) {
        this.expected += expected;
    }

    public void reportFound(int found) {
        this.found += found;
    }

    public void compute(int expected, int found) {

        this.reportExpected(expected);
        this.reportFound(found);

        if (expected == found) {
            this.reportPassedTest();

            if (expected == 0) {
                this.reportTrueNegatives();
                return;
            }
            
            this.reportTruePositives(expected);
            return;
        }
        
        this.reportFailedTest();
        

        if(expected > found) {
            this.reportFalseNegatives(expected - found);
            return;
        }
        
        this.reportFalsePositives(found - expected);        
    }

    public double precision() {
        return this.truePositives / (this.truePositives + this.falsePositives);
    }

    public double recall() {
        return this.truePositives / (this.truePositives + this.falseNegatives);
    }

    public double f1Score() {
        return 2 * (precision() * recall()) / (precision() + recall());
    }

    public double passRate() {
        return (((this.passedTests * 1.0) / (this.passedTests + this.failedTests * 1.0)) * 100);
    }

    public int vulnerabilities() {
        return this.expected;
    }

    public int vulnerabilitiesFound() {
        return this.found;
    }
}
