package com.company.depozit;

import java.util.ArrayList;

public class Depozit {
    private ArrayList<Colet> colet = new ArrayList<>();
    private AdresaDepozit adresa;

    public Depozit() {
    }

    public ArrayList<Colet> getColet() {
        return colet;
    }

    public void setColet(ArrayList<Colet> colet) {
        this.colet = colet;
    }

    public AdresaDepozit getAdresa() {
        return adresa;
    }

    public void setAdresa(AdresaDepozit adresa) {
        this.adresa = adresa;
    }

    public void adaugare(Colet newColet) {
        this.colet.add(newColet);
    }

    public Colet gasesteColet(int codul){
        for (Colet colet: colet){
            if (colet.getCod() == (codul)){
                return colet;
            }
        }
        return null;
    }

    public void listAll() {
            System.out.println("Numarul de colete este " + colet.size());
    }
}


 /*     anunt2.setCod(scanner.nextInt());
        anunt2.setNume(scanner.next());
        anunt2.setDescriere(scanner.next());
        anunt2.setPret(scanner.nextDouble());
        anunt2.setSuprafata(scanner.nextDouble());
      */