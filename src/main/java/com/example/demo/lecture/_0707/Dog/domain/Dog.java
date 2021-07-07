package com.example.demo.lecture._0707.Dog.domain;

//state (name, color, breed, hungry) and behavior (barking, fetching, wagging tail)
import java.util.Scanner;


public class Dog {
    private String name;
    private String color;
    private String breed;
    private String hungry;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return this.color;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }
    public String getBreed(){
        return breed;
    }
    public void setHungry(String hungry){
        this.hungry = hungry;
    }
    public String getHungry(){
        return hungry;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", breed='" + breed + '\'' +
                ", hungry='" + hungry + '\'' +
                '}';
    }
}


