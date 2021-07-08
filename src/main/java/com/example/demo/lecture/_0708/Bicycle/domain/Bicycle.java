package com.example.demo.lecture._0708.Bicycle.domain;

public class Bicycle {
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
        return String.format("Gear : %d\nCompany : %s\nSpeed : %f", gear, company, speed);
    }
}
