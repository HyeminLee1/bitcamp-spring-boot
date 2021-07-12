package com.example.demo.BankAccount.service;

import com.example.demo.BankAccount.domain.BankAccountDTO;

import java.util.Random;

public class BankAccountServiceImpl implements BankAccountService {
    private BankAccountDTO bankAccount;


    //BankAccountServiceImpl이 호출될 때 계좌가 생성되는것이 아닌, createAccount 했을 때 생성 되어야함
    @Override
    public void createAccount(BankAccountDTO bankAccount) {
        this.bankAccount = new BankAccountDTO();    //this. 생략가능
        //(int) (Math.random() * 최대값 + 시작값)
        int random1 = (int) (Math.random() * 10000 + 1000);
        int random2 = (int) (Math.random() * 10000 + 1000);
        int random3 = (int) (Math.random() * 10000 + 1000);
        String random = String.format("계좌번호 %d-%d-%d\n",random1,random2,random3);
        bankAccount.setAccountNumber(random);

    }

    @Override
    public int findBalance(BankAccountDTO bankAccount) {
        return bankAccount.getBalance();
    }

    @Override
    public int deposit(BankAccountDTO bankAccount) {
        bankAccount.setBalance(bankAccount.getBalance() + bankAccount.getMoney());
        return bankAccount.getBalance();
    }

    @Override
    public int withdraw(BankAccountDTO bankAccount) {
        bankAccount.setBalance(bankAccount.getBalance() - bankAccount.getMoney());
        return bankAccount.getBalance();
    }

    @Override
    public void dropAccount(BankAccountDTO bankAccount) {


    }
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