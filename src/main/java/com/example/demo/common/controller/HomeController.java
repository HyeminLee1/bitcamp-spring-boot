package com.example.demo.common.controller;

import com.example.demo.Bank.controller.BankAccountController;
import com.example.demo.Bicycle.Controller.BicycleController;
import com.example.demo.Bicycle.Service.BicycleService;
import com.example.demo.Bicycle.Service.BicycleServiceImpl;
import com.example.demo.Bicycle.domain.BicycleDTO;
import com.example.demo.Dog.Service.DogService;
import com.example.demo.Dog.Service.DogServiceImpl;
import com.example.demo.Dog.domain.DogDTO;
import com.example.demo.calculator.controller.CalculatorController;
import com.example.demo.Dog.controller.DogController;
import com.example.demo.util.controller.UtilController;

import java.util.Scanner;

public class HomeController {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        DogController dogController = new DogController();
        BicycleController bicycleController = new BicycleController();
        BankAccountController bankAccountController = new BankAccountController();
        while(true){
            System.out.println("\n0.Exit 1.Calculator 2.Sequence 3.Add Dog 33.Show Dog 4.Bicycle 44.show Bicycle 5.오늘날짜 6.계좌 66.계좌 확인");
            switch (scanner.next()){
                case "0" : return;
                case "1" : new CalculatorController().calculate(); break;
                case "2" : new CalculatorController().sequence(); break;
                case "3" : dogController.main();
                case "4" :
                    BicycleDTO bicycle = new BicycleDTO();
                    BicycleService bicycleService = new BicycleServiceImpl();
                    System.out.println("기어는 몇 단 입니까?");
                    bicycle.setGear(scanner.nextInt());
                    System.out.println("회사는 어디 입니까?");
                    bicycle.setCompany(scanner.next());
                    System.out.println("속도는 얼마입니까?");
                    bicycle.setSpeed(scanner.nextFloat());
                    bicycleController.add(bicycle);
                break;
                case "44" : bicycleController.show(); break;
                case "5" : new UtilController().todayAndCurrentTime();break;
                case "6" :
                    bankAccountController.main();
                    break;
                    //case "66" :  bankAccountController.show(); break;
                        }
                    }


            }
        }

