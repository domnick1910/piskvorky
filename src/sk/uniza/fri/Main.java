package sk.uniza.fri;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //funkcnost pre kazdé čislo vačšie ako 3 až po n++, v našom prípade po 9
        //velkost pola sa bude počítať (pocethracov * 2 - 1)
        //tzn. 2 * 2 - 1 = 3, 3 je dlzka strany pole bude tým pádom velkosti 3*3
        // ak bude cislo vacsie ako tri
        /*Scanner sc = new Scanner(System.in);
        int pocetHracov;
        int velkostPola;
        System.out.println("Zadajte počet hráčov: ");
        pocetHracov = sc.nextInt();

        // pre nacitanie \n
        sc.nextLine();

        velkostPola = pocetHracov * 2 - 1;
        HraciaPlocha hra = new HraciaPlocha(velkostPola);

        // aby nebol ArrayList prázdny, nech s ním môžeme pracovať
        znaky.add(0," ");

        for (int i = 0; i < pocetHracov; i++) {
            System.out.println("Hrac číslo: " + (i + 1) + " zadajte meno a znak");
            String meno = sc.nextLine();
            String znak = sc.nextLine();

            koniecOverovania = false;

            do {
                for (String e : znaky) {
                    if (e.equals(znak)) {
                        System.out.println("Znak už je zadaný, zadajte znak znovu");
                        znak = sc.nextLine();
                        koniecOverovania = false;
                        continue;
                    }
                    koniecOverovania = true;
                    znaky.add(znak);
                }
            } while(!koniecOverovania);

            hraci.add(new Hrac(meno, znak));
        }

        hra.vykresleniePola();
        //TODO zakomponovat koniec hry a upravit plnost plochy. Ak sa bude tak mozno upravit nech sa nemôtu pouzivat rovnake znaky u hracov
        while(!koniecHry) {
            for (int pocetTahov = 1; pocetTahov <= hra.getVelkostPola(); pocetTahov++) {
                for (int i = 0; i < pocetHracov; i++) {

                    System.out.println("zadajte pozíciu X a Y");
                    hra.setPozX(sc.nextInt());
                    hra.setPozY(sc.nextInt());
                    //ak je policko obsadené prekočí do Ďalšej iterácie cyklu
                    if (!hra.obsadenostPolicka()) {
                        System.out.println("Poličko je obsadené, zadajte súradnice znovu");
                        hra.setPozX(sc.nextInt());
                        hra.setPozY(sc.nextInt());
                    }
                    hra.vyberPolickaPreZnak(hraci.get(i).getZnak());


                    if(!koniecHry) {
                        break;
                    }

                    hra.vykresleniePola();
                }

            }

            System.out.println("Hracia plocha je plná. Prajete si začať odznovu? Y/N");

        }*/
    }

}

