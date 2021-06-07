package com.example.vehicle;

public class Jeep extends Vehicle implements LandVehicle {
    public void soundHorn() {
        System.out.println("*Honk*");
    }

    @Override
    public void drive() {

    }
}
