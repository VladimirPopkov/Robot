package com.company;

public class Robot {

    private int distance;
    private int legs;
    private int steps;

    public Robot(int distance, int legs){
        this.distance = distance;
        this.legs = legs;
    }

    public int start(){
        return steps;
    }
}
