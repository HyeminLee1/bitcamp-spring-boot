package com.example.demo.Dog.Service;

import com.example.demo.Dog.domain.DogDTO;

import java.util.ArrayList;
import java.util.List;


public class DogServiceImpl implements DogService {
    private final DogDTO dog;             //클래스
    private final List<DogDTO> dogs; //컬렉션 클래스 - 제네릭 가짐

    public DogServiceImpl(){
        dog = new DogDTO();
        dogs = new ArrayList<>();
    }

    @Override
    public void add(DogDTO dog) {
        dogs.add(dog);
    }

    @Override
    public int count() {
        return dogs.size();
    }

    @Override
    public List<?> show() {
        return dogs;
    }

    @Override
    public String barking(String bark) {
        return dog.toString() + bark +  "짖는다";
    }

    @Override
    public String fetching(String target) {
        return dog.toString() + target +  "을 물어온다";
    }

    @Override
    public String waggingTail() {
        return "꼬리를 흔든다";
    }
}