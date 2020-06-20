package com.company.colectii;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<String> listaDeObiect = new ArrayList<>();

        listaDeObiect.add("Gabi");
        listaDeObiect.add("Ion");
        //listaDeObiect.remove("Gabi");

        for (int i = 0; i < listaDeObiect.size(); i++){
            String obiect = listaDeObiect.get(i);
            System.out.println(obiect);
        }

        for (String obiect : listaDeObiect){
            System.out.println(obiect);
        }



    }

}
