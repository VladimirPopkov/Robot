package com.company;

public class Leg extends Thread{

    private int stepLenght;
    private int numberOfLeg;

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            stepLenght = (int) (1 + Math.random() * 5);
        }
    }

    public int getStepLenght(){
        return stepLenght;
    }

    public int getNumberOfleg(){
        return numberOfLeg;
    }

    public void setNumberOfLeg(int numberOfLeg){
        this.numberOfLeg = numberOfLeg;
    }
}
