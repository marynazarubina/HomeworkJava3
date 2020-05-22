package com.company;

public class HisCar extends Car implements CarInterface {


    HisCar(String model, String color, int speed) {
        super(model,color,speed);

    }
    public static void main(String[] args) {
        HisCar MercedesG500 = new HisCar("Mercedes G-500", "black", 230);
        MercedesG500.gas(40);
        MercedesG500.brake(170);
        MercedesG500.description();
    }

    @Override
    public void gas(int a) {
        System.out.println("gas: "+a);
    }

    @Override
    public void brake(int a) {
        System.out.println("brake: "+a);
    }

    @Override
    public void description() {System.out.println("Model: "+super.model+"; Color: "+super.color+"; Speed: "+super.speed);    }


}
