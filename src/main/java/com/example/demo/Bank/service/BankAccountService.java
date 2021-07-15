package com.example.demo.Bank.service;

import com.example.demo.Bank.domain.BankAccountDTO;

import java.util.List;

/**
 * * 은행이름은 상수로 정한다.
 이름을 입력하면 계좌가 생성된다 단, 계좌번호는 ****-****-****이고 랜덤값이다.
 금액, 계좌번호 입력한 후 입금한 후 잔액을 확인한다.^
 금액, 계좌번호 입력한 후 출금한 후 잔액 확인한다.
 금액, 계좌번호 입력한 후 잔액을 확인한다.
 계좌번호를 입력한 후 계좌를 해지한다.
 * */

public interface BankAccountService {

     void add(BankAccountDTO bankAccount);
     String count();
     List<? extends BankAccountDTO> findAll();
     String[] findAllAccountNumber();
     void createAccount(BankAccountDTO bankAccount);

     String findBalance(BankAccountDTO bankAccount);
     String deposit(BankAccountDTO bankAccount);
     String withdraw(BankAccountDTO bankAccount);
     void dropAccount(BankAccountDTO bankAccount);

}
