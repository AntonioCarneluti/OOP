package com.company.tema.personalul;

public class PersonalFacultate extends Angajat {
    private String titlu;

    public PersonalFacultate(String nume, String adresa, int numar, String email, int birou, int salariu, String titlu) {
        super(nume, adresa, numar, email, birou, salariu);
        this.titlu = titlu;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public String toString(){
        return this.getNume() + " " + this.getClass().getName();
    }
}
