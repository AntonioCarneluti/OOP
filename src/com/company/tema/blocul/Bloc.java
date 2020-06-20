package com.company.tema.blocul;
import java.util.ArrayList;
import java.util.List;

public class Bloc {
    private String nume;
    private List<Etaj> etaje = new ArrayList<>();

    public Bloc(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public List<Etaj> getEtaj() {
        return etaje;
    }

    public void setEtaj(List<Etaj> etaj) {
        this.etaje = etaj;
    }

    public void adaugaEtaj (Etaj etaj){
        this.etaje.add(etaj);
    }


    public void afiseazaBloc(){
        for (Etaj et : etaje){
            System.out.println("--------------------------");
            System.out.println("--------------------------");
            System.out.println("et-" + et.getNumarEtaj() + ":" );
            et.afiseazaEtaj();
            }
        }


}

