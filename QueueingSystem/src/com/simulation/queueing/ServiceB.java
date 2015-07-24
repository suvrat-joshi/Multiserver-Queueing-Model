package com.simulation.queueing;

/**
 * Created by suvrat on 7/24/15.
 */
public class ServiceB {
    private boolean busy;
    private double serviceTime;
    private double idleTime;
    private Queue queue;
    private int accept;

    private double remainingServiceTime;

    private ConfidenceInterval confidenceInterval; // 95% confidence interval
    private double minST, maxST;

    public ServiceB() {
        // default constructor
        queue = new Queue();
        idleTime = 0.0; // time period for which server remains idle
        accept = 0; // no of parts server has inspected and approved
        busy = false; // implies server is not inspecting any part

        confidenceInterval = new ConfidenceInterval(20,10); // new ConfidenceInterval(mean, S.D.)
        minST = confidenceInterval.getMinValue();
        maxST = confidenceInterval.getMaxValue();
    }

    public void calcSIA(double arrivalPeriod, char arrival, int remainingST) {

        /*
        remainingST == 1 for recursive calls and 0 for other
        */

        if(busy && arrival == 'B' && remainingST == 0) {
            // Service time (ST) = min ST + (max ST-min ST) * r
            serviceTime = minST + (maxST - minST) * LinearCongruential.calcX();

            queue.enqueue(serviceTime);

            if((arrivalPeriod - remainingServiceTime) < 0) {
                remainingServiceTime -= arrivalPeriod;
                busy = true;
                idleTime = idleTime + 0; // currentIdleTime = prevIdleTime + timeStayedIdle
                accept = accept + 0; //currentAcceptCount = prevAcceptCount + noOfPartsAccepted
            } else {
                busy = false;
                if(queue.getDataCount() != 0) {
                    accept = (LinearCongruential.calcX() < 0.9)?accept+1:accept;
                    double leftPeriod = arrivalPeriod - remainingServiceTime;

                    remainingServiceTime = queue.dequeue();
                    calcSIA(leftPeriod, 'B', 1);
                } else {
                    // if queue is empty
                    idleTime += arrivalPeriod - serviceTime;
                    accept = (LinearCongruential.calcX() < 0.9)?accept+1:accept;
                }
            }
        } else if(busy && arrival == 'A' && remainingST == 0) {
            serviceTime = 0.0;
            if((arrivalPeriod - remainingServiceTime) < 0) {
                remainingServiceTime -= arrivalPeriod;
                busy = true;
                idleTime = idleTime + 0; // currentIdleTime = prevIdleTime + timeStayedIdle
                accept = accept + 0; //currentAcceptCount = prevAcceptCount + noOfPartsAccepted
            } else {
                busy = false;

                if(queue.getDataCount() != 0) {
                    accept = (LinearCongruential.calcX() < 0.9)?accept+1:accept;
                    double leftPeriod = arrivalPeriod - remainingServiceTime;

                    remainingServiceTime = queue.dequeue();
                    calcSIA(leftPeriod, 'B', 1);
                } else {
                    // if queue is empty
                    idleTime += arrivalPeriod - remainingServiceTime;
                    accept = (LinearCongruential.calcX() < 0.9)?accept+1:accept;
                }
            }
        } else if(!busy && arrival == 'B' && remainingST == 0) {
            // Service time (ST) = min ST + (max ST-min ST) * r
            serviceTime = minST + (maxST - minST) * LinearCongruential.calcX();

            if((arrivalPeriod - serviceTime) < 0) {
                remainingServiceTime = serviceTime - arrivalPeriod;
                busy = true;
                idleTime = idleTime + 0; // currentIdleTime = prevIdleTime + timeStayedIdle
                accept = accept + 0; //currentAcceptCount = prevAcceptCount + noOfPartsAccepted
            } else {
                busy = false;
                idleTime += arrivalPeriod - serviceTime;
                accept = (LinearCongruential.calcX() < 0.9)?accept+1:accept;
            }
        } else if(!busy && arrival == 'A' && remainingST == 0) {
            serviceTime = 0.0;
            idleTime += arrivalPeriod;
            accept = accept + 0; //currentAcceptCount = prevAcceptCount + noOfPartsAccepted
        } else if(!busy && arrival == 'B' && remainingST == 1) {
            if((arrivalPeriod - remainingServiceTime) < 0) {
                remainingServiceTime -= arrivalPeriod;
                busy = true;
                idleTime = idleTime + 0; // currentIdleTime = prevIdleTime + timeStayedIdle
                accept = accept + 0; //currentAcceptCount = prevAcceptCount + noOfPartsAccepted
            } else {
                busy = false;
                if(queue.getDataCount() != 0) {
                    accept = (LinearCongruential.calcX() < 0.9)?accept+1:accept;
                    double leftPeriod = arrivalPeriod - remainingServiceTime;

                    remainingServiceTime = queue.dequeue();
                    calcSIA(leftPeriod, 'B', 1);
                } else {
                    // if queue is empty
                    idleTime += arrivalPeriod - remainingServiceTime;
                    accept = (LinearCongruential.calcX() < 0.9)?accept+1:accept;
                }
            }
        }

    }

    public int getQueueDataCount() {
        return this.queue.getDataCount();
    }

    public double getServiceTime() {
        return this.serviceTime;
    }

    public double getIdleTime() {
        return this.idleTime;
    }

    public int getAccept() {
        return this.accept;
    }
}
