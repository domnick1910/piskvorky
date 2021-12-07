package sk.uniza.fri;

import java.util.Scanner;

public class Hra {
    private final String[][] hraciaPlocha;
    private final int velkostPola;
    private int pozX;
    private int pozY;
    private boolean jePlnaHPlocha;

    public Hra(int velkostPola) {
        this.jePlnaHPlocha = false;
        this.pozX = 0;
        this.pozY = 0;
        this.velkostPola = velkostPola * 2;
        this.hraciaPlocha = new String[this.velkostPola + 1][this.velkostPola + 1]; // this.velskostPola + 1 ,  5 znakov 01234 + 1 pre dosiahnutie 5

        //inicializácia hracieho pola
        this.inicializaciaHracejPlochy();
    }

    public void vykresleniePola() {
        //horizontalny riadok s cislami
        for (int k = 0; k <= this.velkostPola; k++) {
            if (k == 0 || k % 2 == 1) {
                System.out.print(" ");
            } else {
                System.out.print(k / 2);
            }
        }

        System.out.println();

        for (int i = 0; i <= this.velkostPola; i++) {
            for (int j = 0; j <= this.velkostPola; j++) {
                //vertikalny stplec s cislami
                if ( j == 0) {
                    if (i % 2 == 0) {
                        System.out.print(" ");
                    } else {
                        System.out.print((i + 1) / 2);
                    }
                }
                // vykreslenie hodnoty
                System.out.print(this.hraciaPlocha[i][j]);

            }
            System.out.println();
        }
    }

    public void setPozX(int pozX) {
        if (pozX * 2 - 1 <= this.velkostPola) {
            this.pozX = pozX * 2 - 1;
        } else {
            System.out.println("zlé číslo");
        }
    }

    public void setPozY(int pozY) {
        if (pozY * 2 - 1 <= this.velkostPola) {
            this.pozY = pozY * 2 - 1;
        } else {
            System.out.println("zlé číslo");
        }
    }

    public void vyberPolickaPreZnak(String znakHraca) {
        this.hraciaPlocha[this.pozX][this.pozY] = znakHraca;
    }

    // ak nie je obsadene vrati true
    public boolean obsadenostPolicka() {
        return this.hraciaPlocha[this.pozX][this.pozY].equals(" ");
    }

    //metoda potrebna ak je hracia plocha plná, pomáha ju na novo inicializovat
    public void inicializaciaHracejPlochy() {
        for (int i = 0; i <= this.velkostPola; i++) {
            for (int j = 0; j <= this.velkostPola; j++) {
                if (i % 2 == 0) {
                    this.hraciaPlocha[i][j] = "-";
                } else if (j % 2 == 0) {
                    this.hraciaPlocha[i][j] = "|";
                } else {
                    this.hraciaPlocha[i][j] = " ";
                }
            }
        }
    }

    public boolean getJePlnaHPlocha(int cislo) {
        int velkostPola;
        // pole je v konstruktore zvdojnasobene, tzn. vzdy je parne
        velkostPola = this.velkostPola / 2;


        if (cislo == velkostPola * velkostPola) {
            this.jePlnaHPlocha = true;
        }
        return this.jePlnaHPlocha;
    }

    //metoda pre urcenie ci hra ma dostatok rovnakych znakov pre ukoncenie hry
    public boolean vyhladavanieRovnakychZnakov(String znak, int pocetVitaznych) {
        int porovnavaniePoctu = 1;
        // orverovanie riadku ->
        for(int i = 1; i < this.velkostPola; i += 2){
            if (!this.hraciaPlocha[this.pozX][i].equals(znak))
                break;
            if (porovnavaniePoctu == pocetVitaznych){
                return true;
            }

            porovnavaniePoctu++;
        }

        porovnavaniePoctu = 1;

        //overovanie stlpca  -> ok
        for(int i = 1; i < this.velkostPola; i += 2){
            if (!this.hraciaPlocha[i][this.pozY].equals(znak))
                break;
            if (porovnavaniePoctu == pocetVitaznych) {
                return true;
            }
            porovnavaniePoctu++;
        }
        //TODO dorobit diagonalu a antidiagonalu
        return false;
    }

    // metoda pre test for loop continue a break
    public void vykreslenieFor() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 1) {
                    continue;
                } else if (j == 3) {
                    break;
                }
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public int getPozY() {
        return this.pozY;
    }

    public int getPozX() {
        return this.pozX;
    }
}
