package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int distance;
        int legs;
        Robot robot;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите расстояние: ");
        distance = scanner.nextInt();
        System.out.println("Введите количество ног робота: ");
        legs = scanner.nextInt();
        robot = new Robot(distance, legs);
        System.out.println("Робот сделал " + robot.start() + " шагов");
    }
}
