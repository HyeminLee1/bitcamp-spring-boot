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

    @Override
    public String toString() {
        return BANK_NAME + ":"
                + "예금주 : " + accountName
                + "계좌번호 : " + accountNumber
                + "잔액 : " + balance
                + "거래 일자 : " + date
                + "이자율 : " + interest;
    }

    //@Data를 통해 getter & setter 생성


}
