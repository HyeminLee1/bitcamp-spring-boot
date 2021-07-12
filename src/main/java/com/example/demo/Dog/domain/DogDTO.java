package com.example.demo.Dog.domain;

import lombok.Data;


@Data   //getter, setter 디폴트로 만들어줌
//state (name, color, breed, hungry) and behavior (barking, fetching, wagging tail)
public class DogDTO {
    private String name;
    private String color;
    private String breed;
    private String hungry;
/*
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
*/
    @Override
    public String toString() {
        return String.format("Name : %s\nColor : %s\nBreed : %s\nhungry : %s",name,color,breed,hungry);
    }
}


