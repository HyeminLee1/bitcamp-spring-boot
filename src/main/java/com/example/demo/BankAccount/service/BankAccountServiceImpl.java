package com.example.demo.BankAccount.service;

import com.example.demo.BankAccount.domain.BankAccountDTO;

public class BankAccountServiceImpl {
    private BankAccountDTO bankAccount;

    public BankAccountServiceImpl(){
        this.bankAccount = new BankAccountDTO();
    }




/*
* int balance = 0;

    public int deposit(int amount){
        balance += amount;
        return balance;
    }
    public int withdraw(int amount){
        balance -= amount;
        return balance;
    }
    public int checkMyBalance(){
        System.out.println("잔액 : " + balance);
        return balance;
    }
* */