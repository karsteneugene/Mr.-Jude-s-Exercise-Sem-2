package com.example.vehicle;

public class Hovercraft extends Vehicle implements LandVehicle, SeaVessel {
    public void enterLand() {
        System.out.println("Entering land");
    }

    public void enterSea() {
        System.out.println("Entering sea");
    }

    @Override
    public void drive() {

    }

    @Override
    public void launch() {

    }
}
