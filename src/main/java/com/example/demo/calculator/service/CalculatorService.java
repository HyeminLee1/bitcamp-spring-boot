package com.example.demo.calculator.service;

import com.example.demo.calculator.domain.CalculatorDTO;

public interface CalculatorService {

    int add(CalculatorDTO calculator);
    int subtract(CalculatorDTO calculator);
    int multiple(CalculatorDTO calculator);
    int divide(CalculatorDTO calculator);
    int remain(CalculatorDTO calculator);
    int[] sequence(CalculatorDTO calculator);
    //int[] sequence2(CalculatorDTO Calculator);

}
