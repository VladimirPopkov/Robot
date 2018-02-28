package com.company;

public class Leg extends Thread {

    private int stepLenght;
    private int numberOfLeg;
    private Robot robot;

    public Leg(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            synchronized (robot) {
                if (robot.getCurrentLeg() == numberOfLeg) {
                    System.out.println("Нога " + numberOfLeg + " шагнула");
                    stepLenght = (int) (1 + Math.random() * 5);
                }
            }
        }
    }

    public int getStepLenght() {
        return stepLenght;
    }

    public int getNumberOfleg() {
        return numberOfLeg;
    }

    public void setNumberOfLeg(int numberOfLeg) {
        this.numberOfLeg = numberOfLeg;
    }
}
