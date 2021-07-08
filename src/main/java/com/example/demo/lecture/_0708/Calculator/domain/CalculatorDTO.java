package com.example.demo.lecture._0708.Calculator.domain;

import com.example.demo.lecture._0708.Calculator.controller.CalculatorController;

public class CalculatorDTO {
    private int num1;
    private int num2;
    private String opcode;

    public void setNum1(int num1){
        this.num1 = num1;
    }
    public int getNum1(){
        return num1;
    }
    public void setNum2(int num2){
        this.num2 = num2;
    }
    public int getNum2() {
        return num2;
    }
    public String getOpcode() {
        return opcode;
    }
    public void setOpcode(String opcode) {
        this.opcode = opcode;
    }

}