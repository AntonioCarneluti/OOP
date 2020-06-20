package com.company.tema.personalul;

public class Angajat extends Persoana {
    private int birou;
    private int salariu;
    private MyDate dataAngajarii;

    public Angajat(String nume, String adresa, int numar, String email, int birou, int salariu) {
        super(nume, adresa, numar, email);
        this.birou = birou;
        this.salariu = salariu;
    }

    public int getBirou() {
        return birou;
    }

    public void setBirou(int birou) {
        this.birou = birou;
    }

    public int getSalariu() {
        return salariu;
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }

    public MyDate getDataAngajarii(MyDate dataAngajarii) {
        return this.dataAngajarii;
    }

    public void setDataAngajarii(MyDate dataAngajarii) {
        this.dataAngajarii = dataAngajarii;
    }

    public String toString(){
        return this.getNume() + " " + this.getClass().getName();
    }
}
