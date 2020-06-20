package com.company.tema.blocul;

import java.util.ArrayList;
import java.util.List;

public class Etaj {
    private int numarEtaj;
    List<Apartament> apartament = new ArrayList<>();

    public Etaj(int numarEtaj) {
        this.numarEtaj = numarEtaj;
    }

    public int getNumarEtaj() {
        return numarEtaj;
    }

    public void setNumarEtaj(int numarEtaj) {
        this.numarEtaj = numarEtaj;
    }

    public List<Apartament> getApartament() {
        return apartament;
    }

    public void setApartament(List<Apartament> apartament) {
        this.apartament = apartament;
    }

    public void adaugaApartament (Apartament newApartament){
        this.apartament.add(newApartament);
    }

    public void afiseazaEtaj (){
        for(Apartament apartament: apartament){
            System.out.println("||" + apartament.getNumarApartament() + "." + apartament.getNumeFamilie() + "||");

        }
    }

}
