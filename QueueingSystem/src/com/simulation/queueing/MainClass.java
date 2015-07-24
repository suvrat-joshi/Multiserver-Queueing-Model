package com.simulation.queueing;

/**
 * Created by suvrat on 7/23/15.
 */
public class MainClass {
    public static void main(String[] args) {
        LinearCongruential random = new LinearCongruential(); // Random number generator

        ServiceA serviceA = new ServiceA(); // Inspector or Server who inspects part A
        ServiceB serviceB = new ServiceB(); // Inspector or Server who inspects part B

        TableKeys data = new TableKeys();

        int arrivalInterval = 6; // In every 6 minutes 1 part arrives

        // Arrival Time      Arrival    Queue A     Queue B     Service Time A      Service Time B      Idle Time A     Idle Time B
        // Accepted A        Accepted B

        System.out.format("%15s%10s%10s%10s%20s%20s%15s%15s%15s%15s", "Arrival Time", "Arrival", "Queue A", "Queue B", "Service Time A",
                "Service Time B", "Idle Time A", "Idle Time B", "Accepted A", "Accepted B");

        for(int i = 0;i < 500;i = i + arrivalInterval) {
            data.setArrivalTime(i);

            double arrival = random.calcX();
            if(arrival <  0.9) {
                // service A
                data.setArrival('A');
                serviceA.calcSIA(arrivalInterval, 'A', 0); // 0 implies call from outside
                serviceB.calcSIA(arrivalInterval, 'A', 0);
            } else {
                // service B
                data.setArrival('B');
                serviceA.calcSIA(arrivalInterval, 'B', 0);
                serviceB.calcSIA(arrivalInterval, 'B', 0);
            }

            data.setQueueA(serviceA.getQueueDataCount());
            data.setServiceTimeA(serviceA.getServiceTime());
            data.setIdleTimeA(serviceA.getIdleTime());
            data.setAcceptA(serviceA.getAccept());

            data.setQueueB(serviceB.getQueueDataCount());
            data.setServiceTimeB(serviceB.getServiceTime());
            data.setIdleTimeB(serviceB.getIdleTime());
            data.setAcceptB(serviceB.getAccept());

            System.out.println();
            System.out.format("%15d%10c%10d%10d%20f%20f%15f%15f%15d%15d",
                    data.getArrivalTime(),
                    data.getArrival(),
                    data.getQueueA(),
                    data.getQueueB(),
                    data.getServiceTimeA(),
                    data.getServiceTimeB(),
                    data.getIdleTimeA(),
                    data.getIdleTimeB(),
                    data.getAcceptA(),
                    data.getAcceptB());
            System.out.println();
        }
    }
}
