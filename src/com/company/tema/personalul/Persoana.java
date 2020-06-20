package com.company.tema.personalul;

public class Persoana {
    private String nume;
    private String adresa;
    private int numar;
    private String email;

    public Persoana(String nume, String adresa, int numar, String email) {
        this.nume = nume;
        this.adresa = adresa;
        this.numar = numar;
        this.email = email;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public int getNumar() {
        return numar;
    }

    public void setNumar(int numar) {
        this.numar = numar;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString(){
        return this.getNume() + " " + this.getClass().getName();
    }
}
