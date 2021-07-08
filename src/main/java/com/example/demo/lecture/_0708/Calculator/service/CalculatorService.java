package com.example.demo.lecture._0708.Calculator.service;

import com.example.demo.lecture._0708.Calculator.domain.CalculatorDTO;

public interface CalculatorService {

    public int add(CalculatorDTO calculator);
    public int subtract(CalculatorDTO calculator);
    public int multiple(CalculatorDTO calculator);
    public int divide(CalculatorDTO calculator);
    public int remain(CalculatorDTO calculator);
}
