package com.example.demo.lecture._0708.Calculator.service;

import com.example.demo.lecture._0708.Calculator.domain.CalculatorDTO;

public class CalculatorServiceImpl implements CalculatorService{

    @Override
    public int add(CalculatorDTO calculator) {
        return calculator.getNum1() + calculator.getNum2();
    }

    @Override
    public int subtract(CalculatorDTO calculator) {
        return calculator.getNum1() - calculator.getNum2();
    }

    @Override
    public int multiple(CalculatorDTO calculator) {
        return calculator.getNum1() * calculator.getNum2();
    }

    @Override
    public int divide(CalculatorDTO calculator) {
        return calculator.getNum1() / calculator.getNum2();
    }

    @Override
    public int remain(CalculatorDTO calculator) {
        return calculator.getNum1() % calculator.getNum2();
    }
}
