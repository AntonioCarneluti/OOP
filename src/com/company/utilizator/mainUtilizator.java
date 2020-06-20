package com.company.utilizator;

import java.util.Scanner;

public class mainUtilizator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //String adresa = scanner.next();
        Adresa adresa = new Adresa("Tudor Vladimirescu", "Craiova", 2232);
        Utilizator utilizator = new Utilizator("Bogdan", "Ionescu", adresa);

        System.out.println(utilizator.getNume() + " " + utilizator.getPrenume() + " " + utilizator.getAdresa().getStrada() + " " + utilizator.getAdresa().getOras() + " " + utilizator.getAdresa().getCodPostal());






    }
}
