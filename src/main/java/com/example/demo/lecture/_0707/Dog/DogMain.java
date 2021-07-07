package com.example.demo.lecture._0707.Dog;

//state (name, color, breed, hungry) and behavior (barking, fetching, wagging tail)
import java.util.Scanner;


class Dog{
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


public class DogMain { //가상공간
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
