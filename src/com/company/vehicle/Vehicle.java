package com.company.vehicle;

public class Vehicle {
    private int maxSpeed;

    public Vehicle (int maxSpeed){
        this.maxSpeed = maxSpeed;

    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void afiseaza(){
        System.out.println("Sunt un vehicul");
    }
}
