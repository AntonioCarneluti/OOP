package com.company.tema.personalul;

public class MembruFacultate extends Angajat {
    private int ore;
    private String rang;

    public MembruFacultate(String nume, String adresa, int numar, String email, int birou, int salariu, int ore, String rang) {
        super(nume, adresa, numar, email, birou, salariu);
        this.ore = ore;
        this.rang = rang;
    }

    public int getOre() {
        return ore;
    }

    public void setOre(int ore) {
        this.ore = ore;
    }

    public String getRang() {
        return rang;
    }

    public void setRang(String rang) {
        this.rang = rang;
    }

    public String toString(){
        return this.getNume() + " " + this.getClass().getName();
    }
}

