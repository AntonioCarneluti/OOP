package com.sda;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Produs produs1 = new Produs("alta bere", "bruna", 5);
        Produs produs2 = new Produs("bere", "blonda", 3);



        ArrayList<Produs> listaDeProduse = new ArrayList<>();
        listaDeProduse.add(produs1);
        listaDeProduse.add(produs2);

        Cos cos = new Cos();
        double total = cos.sum(listaDeProduse);
        System.out.println("Totalul este " + total);

    }
}
