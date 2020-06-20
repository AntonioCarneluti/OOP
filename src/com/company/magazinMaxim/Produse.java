package com.company.magazinMaxim;

import java.util.ArrayList;
import java.util.List;

public abstract class Produse { // cu abstract nu se mai pot creea obiecte de tip produs
    private int cod;
    private String nume;
    private String descriere;
    private double pret;
    private List<Haine> haine = new ArrayList<>();
    private List<Electrocasnice> electrocasnice = new ArrayList<>();


    public Produse(int cod, String nume, String descriere, double pret) {
        this.cod = cod;
        this.nume = nume;
        this.descriere = descriere;
        this.pret = pret;
    }

    public Produse(int cod){
        this.cod = cod;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public void afisare(Produse produse){
        System.out.println(produse.getNume() + " " + produse.getPret());
    }

}
