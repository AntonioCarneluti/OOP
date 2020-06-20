package com.company.colectii;

import java.util.ArrayList;

public class ArrayExercises {
    public static void main(String[] args) {
        ArrayList<String> cuvinte = new ArrayList<>();
            cuvinte.add("Muie PSD");
            cuvinte.add("Bag pula-n lume si v-o fac cadou");
            cuvinte.add("Cine e numero uno?");
        System.out.println(cuvinte);
        System.out.println(cuvinte.get(2));
        cuvinte.set(1, "Parazitii");
        System.out.println(cuvinte);
        cuvinte.remove(2);
        System.out.println(cuvinte);

        ArrayList<Integer> numere = new ArrayList<>();
        numere.add(2);
        numere.add(78);
        numere.add(143);
        System.out.println(numere);

    }
}