package com.example.demo.Bank.service;

import com.example.demo.Bank.domain.BankAccountDTO;
import com.example.demo.util.service.*;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.util.service.UtilServiceImpl;

public class BankAccountServiceImpl extends LambdaUtils implements BankAccountService {
    //finalize : 상수화하여 삭제하지 않도록 함(리소스 줄어듬)
     private final BankAccountDTO bankAccount;      //autowired : 생성자
     private final ArrayList<BankAccountDTO> bankAccounts;

     public BankAccountServiceImpl(){
         bankAccount = new BankAccountDTO();
         bankAccounts = new ArrayList<>();
     }

    @Override
    public void add(BankAccountDTO bankAccount) {
        bankAccounts.add(bankAccount);
    }

    @Override
    public String count() {
        return string.apply(bankAccounts.size());
    }

    @Override
    public List<? extends BankAccountDTO> findAll() {
        return bankAccounts;
    }

    @Override
    public String[] findAllAccountNumber() {
         int count = strToInt.apply(count());
         String[] accountNumbers = new String[count];
         for (int i = 0; i < count; i++){
             accountNumbers[i] = bankAccounts.get(i).getAccountName();
         }
         return accountNumbers;
    }

    //BankAccountServiceImpl이 호출될 때 계좌가 생성되는것이 아닌, createAccount 했을 때 생성 되어야함
    @Override
    public void createAccount(BankAccountDTO bankAccount) {
        //this.bankAccount = new BankAccountDTO();    //this. 생략가능
        //(int) (Math.random() * 최대값 + 시작값)
        UtilService utilService = new UtilServiceImpl();
        bankAccount.setAccountNumber(utilService.randomNumber(4,false)+ "-"
                + utilService.randomNumber(4,true) + "-"
                + utilService.randomNumber(4,true));

        bankAccounts.add(bankAccount);
    }

    @Override
    public String findBalance(BankAccountDTO bankAccount) {
        return bankAccount.getMoney();
    }

    @Override
    public String deposit(BankAccountDTO bankAccount) {
         int restMoney = strToInt.apply(bankAccount.getMoney());
         bankAccount.setBalance(bankAccount.getBalance() + bankAccount.getMoney());
        return bankAccount.getBalance();
    }

    @Override
    public String withdraw(BankAccountDTO bankAccount) {
        return "";
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