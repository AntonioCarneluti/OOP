package com.company.generice;

public class mainUser {
    public static void main(String[] args) {
        User eu = new User();
        eu.setNume("Carneluti");
        eu.setPrenume("Antonio");
        eu.setVarsta(28);

        User bunicu = new User();
        eu.setNume("Vadim Tudor");
        eu.setPrenume("Corneliu");
        eu.setVarsta(1000);

        System.out.println("Pitica nenorocita " + eu.compareTo(bunicu));


        Apartament apartament = new Apartament();
        apartament.setPret(125000);
        apartament.setLocatie("Craiova");

        Apartament apartamentSmecher = new Apartament();
        apartamentSmecher.setPret(1000000);
        apartamentSmecher.setLocatie("Nu Craiova");

        System.out.println("Nu vezi fa ca vorbesc niste intelectuali? " + apartament.compareTo(apartamentSmecher));

        CutieCheieValoare<String, Integer> cutieCheieValoare = new CutieCheieValoare<>();
        cutieCheieValoare.setM(23);
        cutieCheieValoare.setT("Babe");
        
    }
}
