package com.company.biblioteca;

import com.company.biblioteca.Biblioteca;
import com.company.biblioteca.Carte;

public class mainBiblioteca {
    public static void main(String[] args) {
        Carte treiMuschetari = new Carte("3 Muschetari", 2234);
        Carte albaCaZapada = new Carte ("Alba ca Zapada", 2343);
        Carte starWars = new Carte ("Star wars", 5534);

        Biblioteca teodorAman = new Biblioteca("Teodor Aman");
        teodorAman.adaugare(treiMuschetari);
        teodorAman.listAllBooks();
        teodorAman.gasesteCarte("Wall Street");
        teodorAman.gasesteCarte("Star wars");

    }
}
