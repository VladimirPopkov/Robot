package com.company;

import java.util.ArrayList;
import java.util.List;

public class Robot {

    private int distance;
    private int legs;
    private int currentLeg;
    private int steps;
    private List<Leg> legList = new ArrayList<>();

    public Robot(int distance, int legs){
        this.distance = distance;
        this.legs = legs;
        for (int i = 0; i < legs; i++) {
            Leg leg = new Leg();
            legList.add(leg);
            leg.start();
        }
    }

    public int start(){

        return steps;
    }
}
