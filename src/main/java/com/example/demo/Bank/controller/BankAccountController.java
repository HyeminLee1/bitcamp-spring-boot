package com.example.demo.Bank.controller;

import com.example.demo.Bank.domain.BankAccountDTO;
import com.example.demo.Bank.service.BankAccountService;
import com.example.demo.Bank.service.BankAccountServiceImpl;
import com.example.demo.util.service.LambdaUtils;

import java.util.List;
import java.util.Scanner;

public class BankAccountController extends LambdaUtils {

    private BankAccountService bankAccountService;

    public BankAccountController(){
        bankAccountService = new BankAccountServiceImpl();
    }

    public void main(){
        Scanner scanner = new Scanner(System.in);
        BankAccountDTO bankAccount = null;      //재활용
        while(true) {
            print.accept("0.종료 1.계좌 생성 2.계좌 목록 3.계좌번호 목록 4.잔액 확인 5.입금 6.출금 7.계좌 해지\n");
            switch (scanner.next()) {
                case "0":
                    return;
                case "1":
                    bankAccount = new BankAccountDTO();
                    print.accept("이름 : ");
                    bankAccount.setAccountName(scanner.next());
                    bankAccountService.createAccount(bankAccount);
                    print.accept(String.format("Account Name : %s\nAccount Number %s\n", bankAccount.getAccountName(), bankAccount.getAccountNumber()));
                    break;
                case "2":
                    print.accept("개설된 계좌 수 :"+bankAccountService.count()+"\n");
                    List<? extends BankAccountDTO> list = bankAccountService.findAll();
                    for(BankAccountDTO bank : list){
                        print.accept(bank.toString()+"\n");
                    }
                    break;
                case "3":
                    for(String s : bankAccountService.findAllAccountNumber()){          //find는 제네릭,findallaccount는 배열이라 코딩이 다름
                        print.accept(s + "\n");
                    }
                    break;
                case "4":
                    print.accept("계좌번호");
                    bankAccount = new BankAccountDTO();
                    bankAccount.setAccountNumber(scanner.next());
                   // print.accept(bankAccountService.findBalance());
                   // bankAccount = bankAccountService.deposit( );
                   // print.accept(bankAccountService.deposit());
                    break;
                case "5":
                    print.accept("계좌번호 : ");
                    bankAccount = new BankAccountDTO();
                    bankAccount.setAccountNumber(scanner.next());
                    print.accept("입금액 : ");
                    bankAccount.setMoney(scanner.next());
                    //print.accept();
                    break;
                case "6":
                    bankAccount = new BankAccountDTO();
                    bankAccountService.dropAccount(bankAccount);
                    break;


            }
        }
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

