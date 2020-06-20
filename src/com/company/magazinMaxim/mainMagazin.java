package com.company.magazinMaxim;

import com.company.depozit.Colet;

public class mainMagazin {
    public static void main(String[] args) {
        Haine pulover = new Haine(2,"pulover", "x", 50, "bumbac","xl", "alb");
        Haine tricou = new Haine(1,"tricou","x",40,"piele", "L", "rosie");
        Electrocasnice cuptor = new Electrocasnice(4,"cuptor", "x",200,"frige", 2);
        Electrocasnice frigider = new Electrocasnice(77, "frigider", "x", 400,"face frig la produse", 2);

        Magazin emag = new Magazin();
            emag.adaugare(pulover);
            emag.adaugare(tricou);
            emag.adaugare(cuptor);
            emag.adaugare(frigider);
            emag.gasesteProdus(2);

        Produse produsGasit = emag.gasesteProdus(4);
        System.out.println("Am gasit produsul " + produsGasit.getCod() + " " + produsGasit.getNume());
    }
}
