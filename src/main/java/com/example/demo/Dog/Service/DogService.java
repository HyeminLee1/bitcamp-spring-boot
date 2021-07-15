package com.example.demo.Dog.Service;

import com.example.demo.Dog.domain.DogDTO;

import java.util.List;

//barking, fetching, wagging tail
public interface DogService {   //{}body

    //컬렉션
    void add(DogDTO dog);
    int count();
    List<?> show();
    //요구사항
    String barking(String bark);  //기능 정의 > 리턴X,파라미터X는 작동 X
    String fetching(String target);
    String waggingTail();
}
