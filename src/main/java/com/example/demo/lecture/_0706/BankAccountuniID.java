package com.example.demo;

class BankAccount1 {
    String accNumber;   //계좌번호
    String ssNumber;    //주민번호
    int balance;        //예금잔액

    //초기화를 위한 메소드
    public void initAccount(String acc, String ss, int bal) {
        accNumber = acc;
        ssNumber = ss;
        balance = bal;      //계좌 개설 시 예금액으로 초기화
    }
    public int deposit(int amount) {
        balance += amount;
        return balance;
    }
    public int withdraw(int amount) {
        balance -= amount;
        return balance;
    }
    public int checkMyBalance() {
        System.out.println("계좌번호 : " + accNumber);
        System.out.println("주민번호 : " + ssNumber);
        System.out.println("잔  액  : " + balance + '\n');
        return balance;
    }
}

class BankAccountUniID {
    public static void main(String[] args) {
        BankAccount1 yoon = new BankAccount1();   //계좌생성
        yoon.initAccount("12-34-89", "990990-9090990", 10000);
        BankAccount1 park = new BankAccount1();
        park.initAccount("33-55-09","770088-5959007",10000);

        yoon.deposit(5000);
        park.deposit(3000);
        yoon.withdraw(2000);
        park.withdraw(2000);
        yoon.checkMyBalance();
        park.checkMyBalance();

    }
}
