package com.example.demo.Dog.controller;

import com.example.demo.Dog.Service.DogService;
import com.example.demo.Dog.Service.DogServiceImpl;
import com.example.demo.Dog.domain.DogDTO;

import java.util.Scanner;

public class DogController { //객체가상공간

    private DogService dogService;
    private DogDTO dog;
    private Scanner scanner;

    public DogController(){
        this.dogService = new DogServiceImpl();
        this.dog = new DogDTO();
        this.scanner = new Scanner(System.in);
    }

    public void dog() {
      //  Scanner scanner = new Scanner(System.in);
      //  DogDTO dog = new DogDTO();      //인스턴스
        System.out.println("What's your name?");
        dog.setName(scanner.next());
        System.out.println("What's your color?");
        dog.setColor(scanner.next());
        System.out.println("What's your breed?");
        dog.setBreed(scanner.next());
        System.out.println("Are you hungry?");
        dog.setHungry(scanner.next());
        //System.out.printf("Name : %s\nColor : %s\nBreed : %s\nHungry : %s\n", dog.getName(), dog.getColor(), dog.getBreed(), dog.getHungry());
        System.out.println(dog.toString());

    }
}
