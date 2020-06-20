package com.company.generice;

public class Apartament implements Comparabil<Apartament> {
    private int pret;
    private String locatie;

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public String getLocatie() {
        return locatie;
    }

    public void setLocatie(String locatie) {
        this.locatie = locatie;
    }

    @Override
    public boolean compareTo(Apartament apartament) {
        if (this.pret > apartament.getPret()){
            return true;
        }
        else{
            return false;
        }
    }
}
