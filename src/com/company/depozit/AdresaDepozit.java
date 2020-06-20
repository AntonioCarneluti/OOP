package com.company.depozit;

public class AdresaDepozit {
    private String strada;
    private String oras;

    public AdresaDepozit(String strada, String oras) {
        this.strada = strada;
        this.oras = oras;
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
}
