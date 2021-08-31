package ua.com.alevel.controller;

import ua.com.alevel.data.*;
import ua.com.alevel.service.PlanetCalculation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PlanetReporter {

    private PlanetCalculation plCalc = new PlanetCalculation();

    public void start() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("select your option");
        String position;
        try {
            runNavigation();
            while ((position = reader.readLine()) != null) {
                crud(position, reader);
                position = reader.readLine();
                if (position.equals("0")) {
                    System.exit(0);
                }
                crud(position, reader);
            }
        } catch (IOException e) {
            System.out.println("problem: = " + e.getMessage());
        }
    }

    private void runNavigation() {
        System.out.println();
        System.out.println("If you want to see gravity acceleration of Earth, please enter 1");
        System.out.println("If you want to see gravity acceleration of Jupiter, please enter 2");
        System.out.println("If you want to see gravity acceleration of Mars, please enter 3");
        System.out.println("If you want to see gravity acceleration of Mercury, please enter 4");
        System.out.println("If you want to see gravity acceleration of Neptune, please enter 5");
        System.out.println("If you want to see gravity acceleration of Saturn, please enter 6");
        System.out.println("If you want to see gravity acceleration of Sun, please enter 7");
        System.out.println("If you want to see gravity acceleration of Uranus, please enter 8");
        System.out.println("If you want to see gravity acceleration of Venus, please enter 9");
        System.out.println("if you want exit, please enter 0");
        System.out.println();
    }

    private void crud(String position, BufferedReader reader) {

        SolarEntity earth = new Earth();
        SolarEntity jupiter = new Jupiter();
        SolarEntity mars = new Mars();
        SolarEntity mercury = new Mercury();
        SolarEntity neptune = new Neptune();
        SolarEntity saturn = new Saturn();
        SolarEntity sun = new Sun();
        SolarEntity uranus = new Uranus();
        SolarEntity venus = new Venus();

        switch (position) {
            case "1":
                System.out.println(plCalc.acceleration(earth.getMass(), earth.getRadius()) + " м/с²");
                break;
             case "2":
                 System.out.println(plCalc.acceleration(jupiter.getMass(), jupiter.getRadius()) + " м/с²");
               break;
            case "3":
                System.out.println(plCalc.acceleration(mars.getMass(), mars.getRadius()) + " м/с²");
                break;
            case "4":
                System.out.println(plCalc.acceleration(mercury.getMass(), mercury.getRadius()) + " м/с²");
                break;
            case "5":
                System.out.println(plCalc.acceleration(neptune.getMass(), neptune.getRadius()) + " м/с²");
                break;
            case "6":
                System.out.println(plCalc.acceleration(saturn.getMass(), saturn.getRadius()) + " м/с²");
                break;
            case "7":
                System.out.println(plCalc.acceleration(sun.getMass(), sun.getRadius()) + " м/с²");
                break;
            case "8":
                System.out.println(plCalc.acceleration(uranus.getMass(), uranus.getRadius()) + " м/с²");
                break;
            case "9":
                System.out.println(plCalc.acceleration(venus.getMass(), venus.getRadius()) + " м/с²");
                break;
        }
        runNavigation();
    }
}

