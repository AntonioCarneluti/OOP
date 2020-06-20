package com.company.vehicle;

public class Tir extends Vehicle {
    public Tir(int maxSpeed) {
        super(maxSpeed);
    }

    @Override
    public void afiseaza(){
        System.out.println("Sunt un tir");
    }
}
