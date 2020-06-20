package com.company.imobiliare;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

public class mainImobiliare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AgentieImobiliara imobiliare = new AgentieImobiliara();
        int optiune = 0;


        while (optiune != -1) {
            System.out.println("1.Adauga Anunt ");
            System.out.println("2.Afiseaza anunturi");
            System.out.println("3.Cautare dupa buget");
            System.out.println("4.Stergere anunt");
            System.out.println("5.Modifica pretul anuntului");
            optiune = scanner.nextInt();
            scanner.nextLine();
            if (optiune == 1) {
                System.out.println("Va rugam introduceti numele, descrierea, pretul si suprafata imobilului si prezentati dosarul cu sina");
                String nume = scanner.next();
                scanner.nextLine();
                String descriere = scanner.next();
                scanner.nextLine();
                Double pret = scanner.nextDouble();
                scanner.nextLine();
                Double suprafata = scanner.nextDouble();
                scanner.nextLine();
                AnuntImobiliar anunt = new AnuntImobiliar();
                anunt.setNume(nume);
                anunt.setDescriere(descriere);
                anunt.setPret(pret);
                anunt.setSuprafata(suprafata);
                imobiliare.adaugare(anunt);
            } else if (optiune == 2) {
                imobiliare.afisareAnunturi();
            } else if (optiune == 3) {
                System.out.println("Introduceti bugetul dumneavoastra");
                double buget = scanner.nextDouble();
                scanner.nextLine();
                 List<AnuntImobiliar> rezultate =  imobiliare.cautareDupaBuget(buget);
                 for (AnuntImobiliar anunt : rezultate){
                     System.out.println(anunt.getNume() + " " + anunt.getPret() + " " + anunt.getSuprafata());
                 }
            } else if (optiune == 4){
                System.out.println("Introduceti titlul anuntului care se va sterge");
                String stergere = scanner.next();
                scanner.nextLine();
                imobiliare.stergeAnuntul(stergere);
            } else if (optiune == 5){
                System.out.println("Alegeti titlul pe care doriti sa il modificati");
                String titlu = scanner.next();
                scanner.nextLine();
                System.out.println("Alegeti suma actualizata");
                double pret = scanner.nextDouble();
                scanner.nextLine();
                imobiliare.schimbaPret(titlu, pret);
            }
            else {
                System.out.println("Mai incearca");
            }
        }


    }

}


/*
                anunt.setCod(scanner.nextInt());
                scanner.nextLine();
                anunt.setNume(scanner.next());
                scanner.nextLine();
                anunt.setDescriere(scanner.next());
                scanner.nextLine();
                anunt.setPret(scanner.nextDouble());
                scanner.nextLine();
                anunt.setSuprafata(scanner.nextDouble());
                scanner.nextLine();
 */