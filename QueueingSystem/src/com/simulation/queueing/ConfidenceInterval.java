package com.simulation.queueing;

/**
 * Created by suvrat on 7/24/15.
 */
public class ConfidenceInterval {
    private double mean;
    private double standardDeviation;

    private double minValue;
    private double maxValue;

    public ConfidenceInterval(double mean, double standardDeviation) {
        // default constructor
        this.mean = mean;
        this.standardDeviation = standardDeviation;
    }

    /* Computing for 95% confidence interval */

    public double getMinValue() {
        double val = mean - 1.96 * standardDeviation/Math.sqrt(50);
        return val;
    }

    public double getMaxValue() {
        double val = mean + 1.96 * standardDeviation/Math.sqrt(50);
        return val;
    }
}
