package sk.uniza.fri;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Hrac> hraci = new ArrayList<Hrac>();
        Scanner sc = new Scanner(System.in);
        int pocetHracov;
        int pocetVitaznych;
        boolean koniecHry = false;
        //funkcnost pre kazdé čislo vačšie ako 3 až po n++, v našom prípade po 9
        //velkost pola sa bude počítať (pocethracov * 2 - 1)
        //tzn. 2 * 2 - 1 = 3, 3 je dlzka strany pole bude tým pádom velkosti 3*3

        System.out.println("Zadajte počet hráčov: ");
        pocetHracov = sc.nextInt();
        // pre nacitanie \n
        sc.nextLine();
        Hra hra = new Hra(pocetHracov * 2 - 1);

        for (int i = 0; i < pocetHracov; i++) {
            System.out.println("Hrac číslo: " + (i + 1) + " zadajte meno a znak");

            hraci.add(new Hrac(sc.nextLine(), sc.nextLine()));
        }

        hra.vykresleniePola();
        //TODO zakomponovat koniec hry a upravit plnost plochy. Ak sa bude tak mozno upravit nech sa nemôtu pouzivat rovnake znaky u hracov
        while(!koniecHry) {
            int pocetTahov = 1;
            for (int i = 0; i < pocetHracov; i++) {
                pocetTahov++;
                if(!hra.getJePlnaHPlocha(pocetTahov)) {
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
                } else {
                    System.out.println("Hracia plocha je plná. Prajete si začať odznovu? Y/N");
                    switch (sc.nextLine()) {
                        case "Y": hra.inicializaciaHracejPlochy();
                            pocetTahov = 1;
                            break;
                        case "N": koniecHry = true;
                            break;
                        default:  System.out.println("Zlý znak");
                            break;
                    }
                }

            }

            hra.vykresleniePola();
        }

    }
}
