package com.company.tema.personalul;

public class mainPersonal {
    public static void main(String[] args) {
        Persoana persoana = new Persoana("Ionescu", "str.Ionilor", 122341412, "ion@yahoo.com");
        Angajat angajat = new Angajat("Popescu", "str.Babelor", 412412412, "popica@yahoo.com", 43, 4000);
        Student student = new Student("Georgescu", "Str.Tamailor", 012424332, "geogeo@yahoo.com");
        PersonalFacultate personalFacultate = new PersonalFacultate("Gigica", "str.Lebedelor", 123232321, "aadad@yahoo.com", 1, 2244, "Secretar" );
        MembruFacultate membruFacultate = new MembruFacultate("Tanasescu", "Str.Zeilor", 122323232, "aaa@yahoo.com", 22, 3452, 22, "conferentiar");
        System.out.println(angajat.toString());
        System.out.println(persoana.toString());
        System.out.println(student.toString());
        System.out.println(personalFacultate.toString());
        System.out.println(membruFacultate.toString());
    }
}
