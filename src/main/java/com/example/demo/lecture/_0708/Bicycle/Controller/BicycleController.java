package com.example.demo.lecture._0708.Bicycle.Controller;


import com.example.demo.lecture._0708.Bicycle.domain.Bicycle;

import java.util.Scanner;

public class BicycleController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bicycle bicycle = new Bicycle();
        System.out.println("Gear?");
        bicycle.setGear(scanner.nextInt());
        System.out.println("Company?");
        bicycle.setCompany(scanner.next());
        System.out.println("Speed?");
        bicycle.setSpeed(scanner.nextFloat());
        System.out.print(bicycle.toString());

    }
}
