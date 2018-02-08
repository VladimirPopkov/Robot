package com.company;

public class Leg extends Thread{

    int stepLenght;

    @Override
    public void run() {
    }

    public int makeStep(){
        stepLenght = (int) (1 + Math.random() * 5);
        return stepLenght;
    }
}
