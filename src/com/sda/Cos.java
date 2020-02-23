package com.sda;

import java.util.ArrayList;

public class Cos {
    public double sum(ArrayList<Produs> produse) {
        double total = 0;
        for (int i = 0; i < produse.size(); i++) {
            Produs produs = produse.get(i); // iei primul produs
            double pret = produs.getPret(); // iei pretul primului produs
            total = total + pret;           // se aduna la total, initial totalul fiind zero, apoi revine in loop
        }
        return total;
    }


}
