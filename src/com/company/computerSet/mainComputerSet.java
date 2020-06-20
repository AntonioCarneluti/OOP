package com.company.computerSet;

public class mainComputerSet {
    public static void main(String[] args) {

        ComputerSet computerSet = new ComputerSet(); //instantiez clasa
        Monitor monitor = new Monitor(145); // setez
        Mouse mouse = new Mouse();
        mouse.setNrButoane(3);
        mouse.setOptic(true);

        computerSet.setMonitor(monitor);
        computerSet.setMouse(mouse);

        System.out.println(computerSet.getMonitor().getDiagonala());
    }

}
