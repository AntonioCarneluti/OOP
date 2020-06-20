package com.company.depozit;

import com.company.utilizator.Adresa;

public class mainDepozit {
    public static void main(String[] args) {
        Adresa adresaDepozit = new Adresa("Elie Georgescu", "Craiova", 220202);
        Colet colet1 = new Colet(32, "Ion");
        Colet colet2 = new Colet (122, "Boomboom");
        Depozit depozit = new Depozit();
        depozit.adaugare(colet1);
        depozit.adaugare(colet2);
        depozit.listAll();

        Colet coletGasit = depozit.gasesteColet(32);
        System.out.println("Am gasit coletul " + coletGasit.getCod() + " " + coletGasit.getNumeDestinar());
    }

}
