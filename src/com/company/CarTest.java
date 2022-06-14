package com.company;

public class CarTest {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.name = "Mazda";
        myCar.model = "CX6";
        myCar.bodyStyle = "Sedan";
        myCar.color = "White";
        myCar.power = 320;

        System.out.println("\nMy Car info:");
        System.out.println("Title: " + myCar.name);
        System.out.println("Model: " + myCar.model);
        System.out.println("Car body: " + myCar.bodyStyle);
        System.out.println("Color: " + myCar.color);
        System.out.println("Power hp: " + myCar.power);


    }
}