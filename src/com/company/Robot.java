package com.company;

import java.util.ArrayList;
import java.util.List;

public class Robot {

    private int distance;
    private int currentLeg = 1;
    private int legs;
    private Object synch = new Object();
    private int steps;
    private List<Leg> legList = new ArrayList<>();

    public Robot(int distance, int legs) {
        this.distance = distance;
        this.legs = legs;
        for (int i = 0; i < legs; i++) {
            Leg leg = new Leg();
            leg.setNumberOfLeg(i + 1);
            legList.add(leg);
            leg.start();
        }
    }

    public int start() {
            while (distance >= 0) {
                for (Leg leg : legList) {
                    synchronized (synch) {
                        if (distance >= 0 /*&& currentLeg == leg.getNumberOfleg()*/) {
                            distance = distance - leg.getStepLenght();
                            System.out.println("Нога " + leg.getNumberOfleg() + " сделала шаг");
                            System.out.println("Осталось пройти " + distance);
                            steps++;
                            if (currentLeg != legs) {
                                currentLeg++;
                            } else {
                                currentLeg = 1;
                            }
                        }
                    }
                }
            }
        for (Leg leg : legList) {
            leg.interrupt();
        }
        return steps;
    }
}
