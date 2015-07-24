package com.simulation.queueing;

/**
 * Created by suvrat on 7/24/15.
 */
public class TableKeys {
    private int arrivalTime;
    private char arrival;
    private int queueA;
    private int queueB;
    private double serviceTimeA;
    private double serviceTimeB;
    private double idleTimeA;
    private double idleTimeB;
    private int acceptA;
    private int acceptB;

    public int getArrivalTime() {
        return this.arrivalTime;
    }

    public void setArrivalTime(int arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public char getArrival() {
        return this.arrival;
    }

    public void setArrival(char arrival) {
        this.arrival = arrival;
    }

    public int getQueueA() {
        return this.queueA;
    }

    public void setQueueA(int queueA) {
        this.queueA = queueA;
    }

    public int getQueueB() {
        return this.queueB;
    }

    public void setQueueB(int queueB) {
        this.queueB = queueB;
    }

    public double getServiceTimeA() {
        return this.serviceTimeA;
    }

    public void setServiceTimeA(double serviceTimeA) {
        this.serviceTimeA = serviceTimeA;
    }

    public double getServiceTimeB() {
        return this.serviceTimeB;
    }

    public void setServiceTimeB(double serviceTimeB) {
        this.serviceTimeB = serviceTimeB;
    }

    public double getIdleTimeA() {
        return this.idleTimeA;
    }

    public void setIdleTimeA(double idleTimeA) {
        this.idleTimeA = idleTimeA;
    }

    public double getIdleTimeB() {
        return this.idleTimeB;
    }

    public void setIdleTimeB(double idleTimeB) {
        this.idleTimeB = idleTimeB;
    }

    public int getAcceptA() {
        return this.acceptA;
    }

    public void setAcceptA(int acceptA) {
        this.acceptA = acceptA;
    }

    public int getAcceptB() {
        return this.acceptB;
    }

    public void setAcceptB(int acceptB) {
        this.acceptB = acceptB;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getArrivalTime() + "\t" + getArrival() + "\t" + getQueueA() + "\t" + getQueueB() + "\t" + getServiceTimeA() + "\t" + getServiceTimeB() + "\t" + getIdleTimeA() + "\t" + getIdleTimeB() + "\t" + getAcceptA() + "\t" + getAcceptB());
        sb.append("\n");

        return sb.toString();
    }
}
