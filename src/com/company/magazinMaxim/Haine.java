package com.company.magazinMaxim;

public class Haine extends Produse {
    private String material;
    private String marime;
    private String culoare;

    public Haine(int cod, String nume, String descriere, double pret, String material, String marime, String culoare) {
        super(cod, nume, descriere, pret);
        this.material = material;
        this.marime = marime;
        this.culoare = culoare;
    }



    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMarime() {
        return marime;
    }

    public void setMarime(String marime) {
        this.marime = marime;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    @Override
    public void afisare(Produse produse){
        System.out.println(getCod() + " " + getNume() + " " + getPret() + material + " " + marime); // de completat cu pret,
    }


}
