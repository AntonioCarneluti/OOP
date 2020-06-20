package com.company.imobiliare;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AgentieImobiliara {
    private List<AnuntImobiliar> anuntImobiliar = new ArrayList<>();


    public AgentieImobiliara() {
    }

    public List<AnuntImobiliar> getAnunturi() {
        return anuntImobiliar;
    }

    public void setAnunturi(List<AnuntImobiliar> anunturi) {
        this.anuntImobiliar = anunturi;
    }

    public void adaugare(AnuntImobiliar newAnunt) {
        this.anuntImobiliar.add(newAnunt);
    }
    public void afisareAnunturi(){
   //    for (AnuntImobiliar anunt : anunt)
       for (int i = 0; i< anuntImobiliar.size(); i++)
        {
            AnuntImobiliar anunt1 = anuntImobiliar.get(i);
            System.out.println(anunt1.getCod() + " " + anunt1.getNume() + " " + anunt1.getDescriere() + " " + anunt1.getPret() + " " + anunt1.getSuprafata());
        }
    }


    public List<AnuntImobiliar> cautareDupaBuget(Double buget){
         List<AnuntImobiliar> rezultate = new ArrayList<>();
         for (AnuntImobiliar anunt : anuntImobiliar){
             if (anunt.getPret() < buget){
                 rezultate.add(anunt);
             }
         }
        return rezultate;
    }

    public List<AnuntImobiliar> cautareDupaBugetStreams(double buget){
        List<AnuntImobiliar> rezultate = anuntImobiliar.stream().filter(anunt -> anunt.getPret() < buget).collect(Collectors.toList());
        return rezultate;
    }

    public List<AnuntImobiliar> cautareDupaSuprafata(double suprafata){
        List<AnuntImobiliar> rezultat = anuntImobiliar.stream().filter(anunt -> anunt.getSuprafata() < suprafata).collect(Collectors.toList());
        return  rezultat;
    }

    public AnuntImobiliar getMostExpensive() {
        AnuntImobiliar rezultat = anuntImobiliar.get(0);
        for (AnuntImobiliar anunt : anuntImobiliar) {
            if (anunt.getPret() > rezultat.getPret()) {
                rezultat = anunt;
            }
        } return rezultat;
    }



    public void stergeAnuntul(String titlu){
        for (int i = 0; i < anuntImobiliar.size(); i++){
            AnuntImobiliar anunt = anuntImobiliar.get(i);
            if(anunt.getNume().equals(titlu)){
                anuntImobiliar.remove(anunt);
            }
        }
    }

    public void schimbaPret(String titlu, double pret){
        for (int i = 0; i < anuntImobiliar.size(); i++){
            AnuntImobiliar anunt = anuntImobiliar.get(i);
            if(anunt.getNume().equals(titlu)){
                anunt.setPret(pret);
            }
        }
    }

}
