package com.company.magazinMaxim;

import java.util.ArrayList;
import java.util.List;

public class Magazin {
    private String name;
    private List<Produse> produse = new ArrayList<>();

    public Magazin(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Produse> getProduse() {
        return produse;
    }

    public void setProduse(List<Produse> produse) {
        this.produse = produse;
    }

    public void adaugare(Produse newProdus){
        this.produse.add(newProdus);
    }

    public Produse gasesteProdus(int cod){
        for (Produse produse : produse){
            if (produse.getCod() == cod){
                return produse;
            }
        }
        return null;
    }
}
