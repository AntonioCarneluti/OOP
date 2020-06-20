package com.company.magazinMaxim;

public class Electrocasnice extends Produse{
    private String specificatieTehnica;
    private int termenGarantie;

    public Electrocasnice(int cod,  String nume, String descriere, double pret, String specificatieTehnica, int termenGarantie) {
        super(cod, nume, descriere, pret);
        this.specificatieTehnica = specificatieTehnica;
        this.termenGarantie = termenGarantie;
    }

    public String getSpecificatieTehnica() {
        return specificatieTehnica;
    }

    public void setSpecificatieTehnica(String specificatieTehnica) {
        this.specificatieTehnica = specificatieTehnica;
    }

    public int getTermenGarantie() {
        return termenGarantie;
    }

    public void setTermenGarantie(int termenGarantie) {
        this.termenGarantie = termenGarantie;
    }
}
