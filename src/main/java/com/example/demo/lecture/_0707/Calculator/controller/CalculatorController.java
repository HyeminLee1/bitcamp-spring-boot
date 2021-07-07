package com.example.demo.lecture._0707.Calculator.controller;



import com.example.demo.lecture._0707.Calculator.domain.Calculator;

import java.util.Scanner;

public class CalculatorController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.println("숫자 1 ?");
        calculator.setNum1(scanner.nextInt());
        System.out.println("연산자");
        calculator.setOpcode("+");
        System.out.println("숫자 2 ?");
        calculator.setNum2(scanner.nextInt());
        System.out.println(calculator.toString());

    }
}
