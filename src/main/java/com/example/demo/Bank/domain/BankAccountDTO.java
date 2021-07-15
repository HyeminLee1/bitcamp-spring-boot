package com.example.demo.Bank.domain;

import lombok.Data;

@Data
public class BankAccountDTO {
    private String money;
    private String balance;
    private String accountName;
    private String accountNumber;
    public static final String BANK_NAME = "비트은행";
    private String date;    //utill에서 String type으로 생성
    private String interest;



    //@Data를 통해 getter & setter 생성


}
