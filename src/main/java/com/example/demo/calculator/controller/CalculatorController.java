package com.example.demo.calculator.controller;

import com.example.demo.calculator.domain.CalculatorDTO;
import com.example.demo.calculator.service.CalculatorServiceImpl;
import com.example.demo.calculator.service.CalculatorService;

import java.util.Scanner;

public class CalculatorController {

    Scanner scanner = new Scanner(System.in);
    CalculatorDTO calculator = new CalculatorDTO();
    CalculatorService calculatorService = new CalculatorServiceImpl();

    public void calculate() {
        System.out.println("숫자 1 ?");
        calculator.setNum1(scanner.nextInt());
        System.out.println("연산자");
        calculator.setOpcode(scanner.next());
        System.out.println("숫자 2 ?");
        calculator.setNum2(scanner.nextInt());
        int result = 0;
        switch (calculator.getOpcode()) {
            case "+":
                result = calculatorService.add(calculator);
                break;
            case "-":
                result = calculatorService.subtract(calculator);
                break;
            case "*":
                result = calculatorService.multiple(calculator);
                break;
            case "/":
                result = calculatorService.divide(calculator);
                break;
            case "%":
                result = calculatorService.remain(calculator);
                break;
        }
        System.out.printf("%d %s %d = %d",
                calculator.getNum1(),
                calculator.getOpcode(),
                calculator.getNum2(),
                result);
    }

    public void sequence() {
        System.out.println("수열의 시작 값");
        calculator.setNum1(scanner.nextInt());
        System.out.println("수열의 마지막 값");
        calculator.setNum2(scanner.nextInt());
        int[] arr = calculatorService.sequence(calculator);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
/*
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculatorDTO calculator = new CalculatorDTO();
        CalculatorService calculatorService = new CalculatorServiceImpl();
        while(true){
            System.out.println("\n[menu] 0.exit 1.calculator 2.sequence");
            switch (scanner.next()){
                case "0" : return;
                case "1" :
                    break;
                case "2" :
                    }
                    break;
            }
        }


        System.out.println("\n"+"연습");
        int[] arrb = calculatorService.sequence2(null);
        for(int j = 0; j < arrb.length; j++){
            System.out.print(arrb[j] + "\t");
        }
        */
        //calculator.setOpcode("+");

       // System.out.println(calculator.toString());


