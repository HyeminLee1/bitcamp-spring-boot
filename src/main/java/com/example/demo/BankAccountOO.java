package com.example.demo;

class BankAccount {
    int balance = 0;

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
}
class BankAccountOO{
    public static void main(String[] args) {
        // 두 개의 인스턴스 생성
        BankAccount Yoon = new BankAccount();
        BankAccount Park = new BankAccount();
        //각 인스턴스 대상으로 예금 진행
        Yoon.deposit(5000);
        Park.deposit(3000);
        //각 인스턴스 대상으로 출금 진행
        Yoon.withdraw(2000);
        Park.withdraw(2000);
        //각 인스턴스를 대상으로 잔액을 조회
        Yoon.checkMyBalance();
        Park.checkMyBalance();
    }
}