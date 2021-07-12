package com.example.demo.util.service;

import com.example.demo.util.domain.UtilDTO;

import java.time.LocalDate;
import java.time.LocalTime;

public class UtilServiceImpl implements UtilService {
   //생성자
    private UtilDTO util;
    public final static UtilDTO util2 = new UtilDTO();

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
}