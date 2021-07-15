package com.example.demo.bankaccount.service;

import com.example.demo.Dog.Service.DogService;
import com.example.demo.Dog.Service.DogServiceImpl;
import com.example.demo.Dog.controller.DogController;
import com.example.demo.Dog.domain.DogDTO;
import com.example.demo.util.service.LambdaUtils;

import java.util.List;
import java.util.Scanner;

public class dog extends LambdaUtils {

    public static void main(String[] args) {
        DogService dogService = new DogServiceImpl();
        Scanner scanner = new Scanner(System.in);
        DogDTO dog = null;
        while (true) {
            print.accept("\nmenu : 0.Exit 1.dog 2.count 3.list\n");
            switch (scanner.next()) {
                case "0":
                    return;
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
                    print.accept(string.apply("\n강아지의 수 : " + dogService.count()+"\n"));
                    break;
                case "3":
                    List<DogDTO> list = (List<DogDTO>)dogService.show();
                    for(DogDTO d : list){
                        print.accept(d.toString());
                    }
                    break;

            }
        }
    }
}
