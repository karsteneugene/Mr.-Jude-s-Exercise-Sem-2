package com.example.vehicle;

public class Frigate extends Vehicle implements SeaVessel {
    public void fireGun() {
        System.out.println("*BANG*");
    }

    @Override
    public void launch() {

    }
}
