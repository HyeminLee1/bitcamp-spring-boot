package com.example.demo.Bank.controller;

import com.example.demo.Bank.domain.BankAccountDTO;
import com.example.demo.Bank.service.BankAccountService;
import com.example.demo.Bank.service.BankAccountServiceImpl;

import java.util.Scanner;

public class BankAccountController{

    private BankAccountService bankAccountService;

    public void main(){
        Scanner scanner = new Scanner(System.in);
        BankAccountDTO bankAccount = null;      //재활용
        while(true) {
            System.out.println("0.종료 1.계좌 생성 11.계좌 목록 2.잔액 확인 3.입금 4.출금 5.계좌 해지");
            switch (scanner.next()) {
                case "0":
                    return;
                case "1":
                    bankAccount = new BankAccountDTO();
                    System.out.println("이름 : [    ]");
                    bankAccount.setAccountName(scanner.next());
                    bankAccountService.createAccount(bankAccount);
                    System.out.printf("Account Name : %s\nAccount Number %s\n", bankAccount.getAccountName(), bankAccount.getAccountNumber());
                    break;
                case "11":
                    bankAccount = new BankAccountDTO();
                case "2":
                    bankAccount = new BankAccountDTO();
                    bankAccountService.findBalance(bankAccount);
                    System.out.println(bankAccountService.findBalance(bankAccount));
                    break;
                case "3":
                    bankAccount = new BankAccountDTO();
                    bankAccount.setMoney(scanner.next());
                    System.out.println(bankAccountService.deposit(bankAccount));
                    break;
                case "4":
                    System.out.println("계좌번호 : [   ]");
                    bankAccount = new BankAccountDTO();
                    bankAccount.setAccountNumber(scanner.next());
                    System.out.println("입금액 : [    ]");
                    bankAccount.setMoney(scanner.next());
                    System.out.println(bankAccountService.withdraw(bankAccount));
                    break;
                case "5":
                    bankAccount = new BankAccountDTO();
                    bankAccountService.dropAccount(bankAccount);
                    break;


            }
        }
    }



    public BankAccountController(){
        bankAccountService = new BankAccountServiceImpl();
    }

    public void add(BankAccountDTO bankAccount) {
        bankAccountService.add(bankAccount);
    }

    public int count() {
        return bankAccountService.count();
    }


    public void createAccount(BankAccountDTO bankAccount) { }

    public int findBalance(BankAccountDTO bankAccount) {
        return 0;
    }

    public int deposit(BankAccountDTO bankAccount) {
        return 0;
    }

    public int withdraw(BankAccountDTO bankAccount) {
        return 0;
    }

    public void dropAccount(BankAccountDTO bankAccount) {

    }
}

        /*
        // 두 개의 인스턴스 생성
        BankAccountDTO Yoon = new BankAccountDTO();
        BankAccountDTO Park = new BankAccountDTO();
        //각 인스턴스 대상으로 예금 진행
        Yoon.deposit(5000);
        Park.deposit(3000);
        //각 인스턴스 대상으로 출금 진행
        Yoon.withdraw(2000);
        Park.withdraw(2000);
        //각 인스턴스를 대상으로 잔액을 조회
        Yoon.checkMyBalance();
        Park.checkMyBalance();
         */

