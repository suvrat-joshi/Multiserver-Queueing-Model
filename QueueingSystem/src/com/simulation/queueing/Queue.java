package com.simulation.queueing;

/**
 * Created by suvrat on 7/24/15.
 */
public class Queue {
    private int front, rear;
    private int maxSize;
    private double[] queueDS;
    private int dataCount;

    /* Queue will be storing serviceTime of the incomming parts */

    public Queue() {
        // default constructor
        front = rear = -1; // initially queue is empty
        maxSize = 30; // maximum items queue can hold
        queueDS = new double[maxSize];
    }

    // Enqueue Operation
    public void enqueue(double data) {
        if(rear == maxSize - 1) {
            System.out.println("Queue Full");
            return;
        } else {
            rear = rear + 1;
            queueDS[rear] = data; // queue holds serviceTime
        }
        if(front == -1)
            front = 0;
    }

    // Dequeue Operation
    public double dequeue() {
        if(front == -1) {
            System.out.println("Queue empty");
            return 0;
        }

        double data = queueDS[front];
        queueDS[front] = 0;

        if(front == rear) {
            front = rear = -1;
        } else {
            front = front + 1;
        }

        return data; // returns the serviceTime
    }

    public int getDataCount() {
        if(rear == -1) {
            return 0; //no data
        } else {
            return (rear - front + 1);
        }
    }
}
