package com.company.generice;

import java.util.ArrayList;
import java.util.List;

public class mainGenerice {
    public static void main(String[] args) {
        List<String>  listaDeSiruri = new ArrayList<>();   //Tipul de date din <> seteaza datele care intra in lista
        listaDeSiruri.add("Gabi");

        GenericBox<String> genericBox = new GenericBox<>();
        genericBox.adaugaInCutie("Ion");
    }


}
