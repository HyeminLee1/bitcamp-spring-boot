package com.example.demo.lecture._0707.Bicycle;

//state (gear, company, speed) and behavior (changing gear, changing pedal cadence, applying brakes)

import java.util.Scanner;

class Bicycle {
    private int gear;
    private String company;
    private float speed;

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getGear() {
        return this.gear;       //this생략가능
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public float getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        /*return "Bicycle{" +
                "gear=" + gear +
                ", company='" + company + '\'' +
                ", speed=" + speed +
                '}';*/
        return String.format("Gear : %d\nCompany : %s\nSpeed : %f", gear, company, speed);
    }
}

    public class BicycleMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bicycle bicycle = new Bicycle();
        System.out.println("Gear?");
        bicycle.setGear(scanner.nextInt());
        System.out.println("Company?");
        bicycle.setCompany(scanner.next());
        System.out.println("Speed?");
        bicycle.setSpeed(scanner.nextFloat());
        System.out.print(bicycle.toString());

    }

}
