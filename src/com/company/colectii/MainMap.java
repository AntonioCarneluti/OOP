package com.company.colectii;

import java.util.HashMap;
import java.util.Map;

public class MainMap {
    public static void main(String[] args) {
    Map<String, String> taraCuCapitala = new HashMap<>(); //k adica cheile trebuie sa fie unice
    taraCuCapitala.put("Poland", "Warsaw");
    taraCuCapitala.put("Romania", "Bucuresti");
    taraCuCapitala.put("France", "Paris");
    taraCuCapitala.put("Anglia", "Londra");

    for(Map.Entry<String, String> intrare : taraCuCapitala.entrySet()){
        String cheie = intrare.getKey();
        String valoarea = intrare.getValue();
        System.out.println(cheie + " " + valoarea);
    }

    String value = taraCuCapitala.get("Anglia");
        System.out.println(value);


    }
}
