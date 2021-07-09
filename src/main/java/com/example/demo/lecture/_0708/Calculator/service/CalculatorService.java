package com.example.demo.lecture._0708.Calculator.service;

import com.example.demo.lecture._0708.Calculator.domain.CalculatorDTO;

public interface CalculatorService {

    int add(CalculatorDTO calculator);
    int subtract(CalculatorDTO calculator);
    int multiple(CalculatorDTO calculator);
    int divide(CalculatorDTO calculator);
    int remain(CalculatorDTO calculator);
    int[] sequence(CalculatorDTO calculator);
    int[] sequence2(CalculatorDTO Calculator);

}
