package com.company;

/**
 * Created by Laptop on 2016-02-27.
 */
public class Pozycja {
    private String nazwaTowaru;
    private int ileSztuk;
    private double cena;

    Pozycja(String nazwaTowaru, int ileSztuk, double cena) {
        this.nazwaTowaru = nazwaTowaru;
        this.ileSztuk = ileSztuk;
        this.cena = cena;
    }

    public double obliczWartosc() {
        if (ileSztuk>20) {
            System.out.println("Rabat 15%");
            return this.obliczWartoscZRabatem();
        }
        else if (ileSztuk>=10) {
            System.out.println("Rabat 10%");
            return this.obliczWartoscZRabatem();
        }
        else if (ileSztuk>=10) {
            System.out.println("Rabat 5%");
            return this.obliczWartoscZRabatem();
        }
        else
            return this.obliczWartoscZRabatem();
    }
    double obliczWartoscZRabatem(){
        if (ileSztuk>20)
            return this.ileSztuk * (this.cena*0.85);
        else if (ileSztuk>=10)
            return this.ileSztuk * (this.cena*0.9);
        else if (ileSztuk>=10)
            return this.ileSztuk * (this.cena*0.95);
        else
            return this.ileSztuk * this.cena;
    }
    @Override
    public String toString() {
        return "" +
                " '" + nazwaTowaru + '\'' +
                ", ileSztuk=" + ileSztuk +
                ", cena=" + cena +
                ", cena z rabatem"+obliczWartosc()/ileSztuk+
                '}';
    }
}
