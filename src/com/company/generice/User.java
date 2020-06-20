package com.company.generice;

public class User implements Comparabil<User> {
    private String nume;
    private String prenume;
    private int varsta;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }


    @Override
    public boolean compareTo(User user) {
        if (this.varsta > user.getVarsta()) {
            return true;
        } else {
            return false;
        }
    }
}
