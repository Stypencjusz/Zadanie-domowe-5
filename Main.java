package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Pozycja test = new Pozycja("Wodka",10,10);
        System.out.println(test);
        Pozycja test1 = new Pozycja("Koks",100,1.5);
        System.out.println(test1);
        Pozycja test2 = new Pozycja("Dziwki",100,150);
        System.out.println(test2);
        Pozycja test3= new Pozycja("Lasery",100,10);
        System.out.println(test3);
        Pozycja p1 = new Pozycja("Chleb", 1, 3.5);
        System.out.println(p1);
        Pozycja p2 = new Pozycja("Cukier", 3, 4);
        System.out.print(p2);
        Zamowienie z = new Zamowienie(20);
        z.dodajPozycje(p1);
        z.dodajPozycje(p2);
        System.out.println(z);
    }
}
