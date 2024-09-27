package br.unb.cic.joana;

public class Metrics {

    private static Metrics instance;

    private double truePositives;
    private double falsePositives;

    private double falseNegatives;

    private Metrics() {
        this.truePositives = 0.0;
        this.falsePositives = 0.0;
        this.falseNegatives = 0.0;
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

    public double precision() {
        return this.truePositives / (this.truePositives + this.falsePositives);
    }

    public double recall() {
        return this.truePositives / (this.truePositives + this.falseNegatives);
    }

    public double f1Score() {
        return 2 * (precision() * recall()) / (precision() + recall());
    }
}
