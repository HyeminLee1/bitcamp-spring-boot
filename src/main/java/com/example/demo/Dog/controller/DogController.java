package com.example.demo.Dog.controller;

import com.example.demo.Dog.Service.DogService;
import com.example.demo.Dog.Service.DogServiceImpl;
import com.example.demo.Dog.domain.DogDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class DogController{

    private  DogService dogService;

    public DogController(){
        dogService = new DogServiceImpl();
    }

    public void add(DogDTO dog) {
        dogService.add(dog);
    }

    public int count() {
        return dogService.count();
    }

    public void show() {
        System.out.println("강아지의 수 : " + dogService.count() );
        System.out.println(dogService.show());
    }

    public String barking(String bark) {
        return dogService.barking(bark);
    }


    public String fetching(String target) {
        return dogService.fetching(target);
    }


    public String waggingTail() {
        return dogService.waggingTail();
    }
}



/** //객체가상공간

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
 */