package com.company.utilizator;

import com.company.magazinMaxim.Product;

import java.util.ArrayList;
import java.util.List;

public class Adresa {
    private String strada;
    private String oras;
    private int codPostal;

    public Adresa(String strada, String oras, int codPostal) {
        this.strada = strada;
        this.oras = oras;
        this.codPostal = codPostal;
    }

    public Adresa(){

    }

    public String getStrada() {
        return strada;
    }

    public void setStrada(String strada) {
        this.strada = strada;
    }

    public String getOras() {
        return oras;
    }

    public void setOras(String oras) {
        this.oras = oras;
    }

    public int getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(int codPostal) {
        this.codPostal = codPostal;
    }

    public static class Magazin {

        private String nume;
        private List<Product> produse = new ArrayList<>();

        public String getNume() {
            return nume;
        }

        public void setNume(String nume) {
            this.nume = nume;
        }

        public List<Product> getProduse() {
            return produse;
        }

        public void setProduse(List<Product> produse) {
            this.produse = produse;
        }
    }
}
