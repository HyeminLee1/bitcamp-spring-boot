package com.example.demo.BankAccount.domain;

import lombok.Data;

import java.time.LocalDate;
@Data
public class BankAccountDTO {
    private int money;
    private String accountName;
    private String accountNumber;
    public static final String BANK_NAME = "비트은행";
    private String date;    //utill에서 String type으로 생성
    private float interest;

    //@Data를 통해 getter & setter 생성


}
