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
                    stepLenght = (int) (1 + Math.random() * 5);
                    robot.setDistance(robot.getDistance() - stepLenght);
                    System.out.println("Нога " + numberOfLeg + " сделала шаг");
                    System.out.println("Осталось пройти " + robot.getDistance());
                    robot.setCurrentLeg(robot.getCurrentLeg() + 1);
                    robot.setSteps(robot.getSteps() + 1);
                }
                else if (robot.getDistance() <= 0) {
                    this.interrupt();
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
