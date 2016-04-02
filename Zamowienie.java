package com.company;


import java.io.File;
import java.util.Scanner;


/**
 * Created by Laptop on 2016-02-27.
 */
public class Zamowienie {
    private Pozycja[] pozycje;
    private int ileDodanych=0;
    private int maksRozmiar;
    public Zamowienie() {
        maksRozmiar = 10;
    }
    public Zamowienie(int maksRozmiar){
        this.maksRozmiar = maksRozmiar;
    }
    public void dodajPozycje(Pozycja p){
        if (ileDodanych>=maksRozmiar){
            System.out.println("Przekroczono ilosc pozycji w zamowieniu");
        }
        else
        {
            pozycje[ileDodanych] = p;
            ileDodanych++;
        }
}
   public double obliczWartosc(){
        double wartosc=0;
        for(int i = 0; i < ileDodanych; i++){
            wartosc+=pozycje[i].obliczWartosc();
        }
       return wartosc;
   }
    @Override
    public String toString() {
        String text ="\n Zamówienie: \n";
                for (int i=0;i < ileDodanych;i++){
                    text+=pozycje[i]+"\n";
                }
        text += "\n Razem: " + obliczWartosc() + " zł";
        return text;
    }
    public static void zapiszZamowienie(Zamowienie z, String nazwaPliku){
        File file = new File(nazwaPliku);
    }

}
