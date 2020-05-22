package com.company;

public abstract class Car {

    String model;
    String color;
    int speed;

    public Car(String model, String color, int speed) {
        this.model = model;
        this.color = color;
        this.speed = speed;
    }

    void gas(int a) {
    }

    void brake(int a) {
    }

    abstract void description();

}