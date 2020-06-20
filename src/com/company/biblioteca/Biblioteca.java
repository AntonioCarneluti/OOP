package com.company.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nume;
    private List<Carte> carte = new ArrayList<>();

    public Biblioteca(String nume) {
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public List<Carte> getCarte() {
        return carte;
    }

    public void setCarte(List<Carte> carte) {
        this.carte = carte;
    }

    public void adaugare(Carte newCarte) { // "Carte" este lista, iar "newCarte" este variabila, putea avea orice denumire
        this.carte.add(newCarte); // cu this pentru a diferentia intre carti
    }

    /*  public String cautare(Carte carte){

      }
    */
    public void listAllBooks() {
        for (Carte carte : carte) {
            System.out.println(carte.getCod() + " " + carte.getName());
        }
    }

    public Carte gasesteCarte(String titluCautat) {
        for (Carte carte : carte) {
            if (carte.getName().equals(titluCautat)) {
                System.out.println("Am gasit-o " + carte.getName());
                return carte;
            }
        }
        return null;
    }






}
