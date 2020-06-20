package com.company.tema.personalul;

public class Student extends Persoana {
    private enum statut{
        boboc,
        sophomore,
        junior,
        senior,

    }

    public Student(String nume, String adresa, int numar, String email) {
        super(nume, adresa, numar, email);
    }

    public String toString(){
        return this.getNume() + " " + this.getClass().getName();
    }

}
