package com.company.depozit;

public class Colet {
    public int cod;
    public String numeDestinar;

    public Colet(int cod, String numeDestinar) {
        this.cod = cod;
        this.numeDestinar = numeDestinar;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNumeDestinar() {
        return numeDestinar;
    }

    public void setNumeDestinar(String numeDestinar) {
        this.numeDestinar = numeDestinar;
    }
}
