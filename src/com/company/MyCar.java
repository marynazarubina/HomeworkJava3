package com.company;

public class MyCar extends  Car {

    MyCar(String model, String color, int speed) {
        super(model,color,speed);

    }
    public static void main(String[] args) {
        MyCar BMW_Z4 = new MyCar("BMW_Z4","black",250);
        BMW_Z4.gas(50);
        BMW_Z4.brake(190);
        BMW_Z4.description();
    }

    void gas(int a) {
        System.out.println("gas: "+a);
    }
    void brake(int a) {
        System.out.println("brake: "+a);
    }

    @Override
    void description () {
        System.out.println("Model: "+super.model+"; Color: "+super.color+"; Speed: "+super.speed);
    }

}
