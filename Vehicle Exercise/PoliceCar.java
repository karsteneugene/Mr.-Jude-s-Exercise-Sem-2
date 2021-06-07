package com.example.vehicle;

public class PoliceCar extends Vehicle implements IsEmergency, LandVehicle{
    String policeName;
    String codeName;

    @Override
    public void soundSiren() {

    }

    @Override
    public void drive() {

    }
}
