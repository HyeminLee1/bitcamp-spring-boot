package com.example.demo.util.service;

import java.util.function.Consumer;
import java.util.function.Function;

public class LambdaUtils {

    public static Consumer<String> print = System.out::print;
    public static Function<Object, String> string = String::valueOf; //Object 무엇이든지 다 받음
    public static Function<String, Integer> strToInt = Integer::parseInt;       //String으로 받아서 Int로 변환

}

