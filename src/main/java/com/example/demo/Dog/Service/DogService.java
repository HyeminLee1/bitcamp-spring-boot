package com.example.demo.Dog.Service;
//barking, fetching, wagging tail
public interface DogService {   //{}body

    String barking(String bark);  //기능 정의 > 리턴X,파라미터X는 작동 X
    String fetching(String target);
    String waggingTail();
}
