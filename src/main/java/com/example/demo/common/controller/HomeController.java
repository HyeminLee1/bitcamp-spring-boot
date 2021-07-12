package com.example.demo.common.controller;

import com.example.demo.BankAccount.controller.BankAccountController;
import com.example.demo.Bicycle.Controller.BicycleController;
import com.example.demo.calculator.controller.CalculatorController;
import com.example.demo.Dog.controller.DogController;
import com.example.demo.util.controller.UtilController;

import java.util.Scanner;

public class HomeController {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        CalculatorController calculatorController = new CalculatorController();
        DogController dogController = new DogController();
        BicycleController bicycleController = new BicycleController();
        UtilController utilController = new UtilController();
        BankAccountController bankAccountController = new BankAccountController();
        while(true){
            System.out.println("\n0.Exit 1.Calculator 2.Sequence 3.Dog 4.Bicycle 5.오늘날짜 6.계좌");
            switch (scanner.next()){
                case "0" : return;
                case "1" : calculatorController.calculate(); break;
                case "2" : calculatorController.sequence(); break;
                case "3" : dogController.dog(); break;
                case "4" : bicycleController.bike(); break;
                case "5" : utilController.todayAndCurrentTime();break;
                case "6" : bankAccountController.main(); break;

            }
        }
    }
}
