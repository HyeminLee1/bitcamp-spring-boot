package com.example.demo.Bicycle.Service;


import com.example.demo.Bicycle.domain.BicycleDTO;

import java.util.ArrayList;
import java.util.List;

//changing gear, changing pedal cadence, applying brakes
public interface BicycleService {

    void add(BicycleDTO bicycle);
    int count();
    List<?> show();

    void gear();
    void pedal();
    void brakes();

}
