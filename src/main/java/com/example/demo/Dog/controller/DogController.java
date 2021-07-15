package com.example.demo.Dog.controller;

import com.example.demo.Dog.Service.DogService;
import com.example.demo.Dog.Service.DogServiceImpl;
import com.example.demo.Dog.domain.DogDTO;
import com.example.demo.util.service.LambdaUtils;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class DogController extends LambdaUtils {

    private DogService dogService;

    public DogController() {
        dogService = new DogServiceImpl();
    }

    public void main() {
        Scanner scanner = new Scanner(System.in);
        DogDTO dog = null;
        while (true) {
            print.accept("\nmenu : 0.Exit 1.dog 2.count 3.list");
            switch (scanner.next()) {
                case "0": return;
                case "1":
                    dog = new DogDTO();
                    print.accept("Name?");
                    dog.setName(scanner.next());
                    print.accept("Color?");
                    dog.setColor(scanner.next());
                    print.accept("Breed ?");
                    dog.setBreed(scanner.next());
                    dogService.add(dog);
                    break;
                case "2":
                    print.accept(string.apply("강아지의 수 : " + dogService.count() + "\n" ));
                    break;
                case "3":
                    List<DogDTO> list = (List<DogDTO>)dogService.show();
                    for(DogDTO d : list) {
                        print.accept("\n"+dogService.show().toString());
                    }
                    break;
            }
        }
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