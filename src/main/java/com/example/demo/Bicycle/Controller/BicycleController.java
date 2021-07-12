package com.example.demo.Bicycle.Controller;


import com.example.demo.BankAccount.service.BankAccountService;
import com.example.demo.Bicycle.Service.BicycleImpl;
import com.example.demo.Bicycle.Service.BicycleService;
import com.example.demo.Bicycle.domain.BicycleDTO;

import java.util.Scanner;

public class BicycleController {

    private BicycleDTO bicycle;
    private BicycleService bicycleService;
    private Scanner scanner;

    public BicycleController(){
        this.bicycle = new BicycleDTO();
        this.bicycleService = new BicycleImpl();
        this.scanner = new Scanner(System.in);
    }
    public void bike() {
        //Scanner scanner = new Scanner(System.in);
        //BicycleDTO bicycle = new BicycleDTO();
        System.out.println("Gear?");
        bicycle.setGear(scanner.nextInt());
        System.out.println("Company?");
        bicycle.setCompany(scanner.next());
        System.out.println("Speed?");
        bicycle.setSpeed(scanner.nextFloat());
        System.out.print(bicycle.toString());

    }
}
