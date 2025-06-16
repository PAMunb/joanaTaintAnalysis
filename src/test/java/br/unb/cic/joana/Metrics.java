package br.unb.cic.joana;

public class Metrics {

    private static Metrics instance;

    public double truePositives;
    public double falsePositives;
    public double falseNegatives;
    public int passedTests;
    public int failedTests;

    private Metrics() {
        this.truePositives = 0.0;
        this.falsePositives = 0.0;
        this.falseNegatives = 0.0;
        this.passedTests = 0;
        this.failedTests = 0;
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

    public void reportPassedTest() {
        this.passedTests += 1;
    }

    public void reportFailedTest() {
        this.failedTests += 1;
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
}
