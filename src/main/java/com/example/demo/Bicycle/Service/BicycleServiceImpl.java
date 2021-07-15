package com.example.demo.Bicycle.Service;

import com.example.demo.Bicycle.domain.BicycleDTO;

import java.util.ArrayList;
import java.util.List;

public class BicycleServiceImpl implements BicycleService{

    private BicycleDTO bicycle;
    private  List<BicycleDTO> bicycles;

    public BicycleServiceImpl(){
        bicycle = new BicycleDTO();
        bicycles = new ArrayList<>();
    }
    @Override
    public void add(BicycleDTO bicycle) {
        bicycles.add(bicycle);
    }

    @Override
    public int count() {
        return bicycles.size();
    }

    @Override
    public List<?> show() {
        return bicycles;
    }

    @Override
    public void gear() {

    }

    @Override
    public void pedal() {

    }

    @Override
    public void brakes() {

    }
}
