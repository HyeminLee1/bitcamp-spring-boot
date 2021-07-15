package com.example.demo.util.service;

import com.example.demo.util.domain.UtilDTO;

import java.time.LocalDate;
import java.time.LocalTime;

public class UtilServiceImpl implements UtilService {
   //생성자
    private UtilDTO util;

    // 10. util 초기화 방법
    public UtilServiceImpl(){
        this.util = new UtilDTO(); //호출될때 초기화
    }

    @Override
    public LocalDate today() {
        util.setToday(LocalDate.now());
        return util.getToday();
    }

    @Override
    public LocalTime currentTime() {
        util.setCurrentTime(LocalTime.now());
        return util.getCurrentTime();
    }

    @Override
    public String todayAndCurrentTime() {
        return String.format("%s %s",today(),currentTime());
    }

    @Override
    public String randomNumber(int digits, boolean allowZeroValue) {
        String first = "",result = "";
        first += allowZeroValue ? ((int) (Math.random() * 10)) : ((int) (Math.random() * 9 + 1));
        for(int i=0; i<digits; i++){
            result += (int) (Math.random() * 10);
        }
        return result;
    }
}
