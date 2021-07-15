package com.example.demo.bankaccount.service;

import com.example.demo.util.service.UtilService;
import com.example.demo.util.service.UtilServiceImpl;

public class BankServiceImplTest {
    public static void main(String[] args) {
        UtilService utilService = new UtilServiceImpl();
        String first = utilService.randomNumber(4);
        String firstNum = first.substring(1, 2);
        System.out.println(firstNum);
        if (firstNum.equals("0")) {
            System.out.println("다시");
        }
    }
}
