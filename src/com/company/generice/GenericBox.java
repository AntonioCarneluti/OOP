package com.company.generice;

public class GenericBox<T> {
    private T obiectDinCutie;
    public void adaugaInCutie(T obiectDinCutie){
        this.obiectDinCutie = obiectDinCutie;
    }

    public T getObiectDinCutie() {
        return obiectDinCutie;
    }
}
