package com.simulation.queueing;

/**
 * Created by suvrat on 7/23/15.
 */
public class LinearCongruential {
    //x(i+1) = (x(i) + a) modulo b
    private static double x = 47, a = 23, b = 1000;

    public LinearCongruential() {
        // default constructor
    }

    public static double calcX() {
        x = (x + a) % b; // Generates a random integer [0,999]
        return x/(b-1); // returns a random number [0,1]
    }
}
