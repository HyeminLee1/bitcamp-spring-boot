package com.example.demo.lecture._0707.Dog.controller;

import com.example.demo.lecture._0707.Dog.domain.Dog;

import java.util.Scanner;

public class DogController { //가상공간
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dog dog = new Dog();      //인스턴스
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
