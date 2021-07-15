package com.example.demo.util.service;

public class UtilServiceImplTest {
    public static void main(String[] args) {
            String result = "";
            for (int i = 0; i < 1; i++) {
                result += (int) (Math.random() * 9 + 1) ;
        }
        System.out.println(result);
    }
}
