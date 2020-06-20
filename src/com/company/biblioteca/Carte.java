package com.company.biblioteca;

public class Carte {
    private String name;
    private int cod;

    public Carte(){

    }

    public Carte(String name, int cod) {
        this.name = name;
        this.cod = cod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
}
