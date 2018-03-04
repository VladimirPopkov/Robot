package com.company;

import java.util.ArrayList;
import java.util.List;

public class Robot {

    private int distance;
    private int currentLeg = 1;
    private int legs;
    private int steps;
    private List<Leg> legList = new ArrayList<>();

    public Robot(int distance, int legs) {
        this.distance = distance;
        this.legs = legs;
        for (int i = 0; i < legs; i++) {
            Leg leg = new Leg(this);
            leg.setNumberOfLeg(i + 1);
            legList.add(leg);
            leg.start();
        }
    }

    public int start() {
        for (Leg leg : legList){
            try {
                leg.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return steps;
    }

    public int getCurrentLeg() {
        return currentLeg;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void setCurrentLeg(int currentLeg) {
        this.currentLeg = currentLeg;
        if (currentLeg > legs){
            this.currentLeg = 1;
        }
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }
}
