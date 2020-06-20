package com.company.colectii;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class mainSet {
    public static void main(String[] args) {
        Set<String> listaDeObiect = new HashSet<>();

        listaDeObiect.add("Gabi");
        listaDeObiect.add("Ion");
        listaDeObiect.add("Ion");
        //listaDeObiect.remove("Gabi");

        for (String obiect : listaDeObiect){
            System.out.println(obiect);
        }



    }

}
