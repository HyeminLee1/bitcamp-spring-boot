package com.example.demo.Bicycle.Controller;


import com.example.demo.Bicycle.Service.BicycleServiceImpl;
import com.example.demo.Bicycle.Service.BicycleService;
import com.example.demo.Bicycle.domain.BicycleDTO;

import java.util.List;
import java.util.Scanner;

public class BicycleController{

    private BicycleService bicycleService;


    public BicycleController(){
        this.bicycleService = new BicycleServiceImpl();
    }

    public void add(BicycleDTO bicycle) {
        bicycleService.add(bicycle);
    }

    public void show() {
        System.out.println("자전거 수 : " + bicycleService.count());
        System.out.println(bicycleService.show());

    }

    public void gear() {

    }

    public void pedal() {

    }

    public void brakes() {

    }
}


/*
                Scanner scanner = new Scanner(System.in);
                BicycleDTO bicycle = new BicycleDTO();
                System.out.println("Gear?");
                bicycle.setGear(scanner.nextInt());
                System.out.println("Company?");
                bicycle.setCompany(scanner.next());
                System.out.println("Speed?");
                bicycle.setSpeed(scanner.nextFloat());
                System.out.print(bicycle.toString());
     */