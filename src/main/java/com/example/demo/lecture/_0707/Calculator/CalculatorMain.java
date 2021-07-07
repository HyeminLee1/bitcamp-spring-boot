package com.example.demo.lecture._0707.Calculator;

import java.util.Scanner;

class Calculator {
    int num1;
    int num2;
    int num3;

    public void setNum1(int num1){
        this.num1 = num1;
    }
    
}

public class CalculatorMain {
    public static void main(String[] args) {
        System.out.println("숫자 1 ?");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        System.out.println();
        System.out.println("숫자 2 ?");
        int num2 = scanner.nextInt();
        int num3 = num1 + num2;
        System.out.printf("%d + %d = %d", num1, num2, num3);

    }
}


