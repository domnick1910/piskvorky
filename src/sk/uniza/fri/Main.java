package sk.uniza.fri;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int velkostPola;
        //funkcnost pre kazdé čislo vačšie ako 3 až po n++
        //System.out.println("Zadajte velkost hraciej plochy od 3 po 9");

        //velkostPola = sc.nextInt();

        Hra hra = new Hra(3);

        hra.inicializaciaHracejPlochy();

        hra.vykresleniePola();

        hra.setPozX(1);
        hra.setPozY(3);
        hra.vyberPolickaPreZnak("x");
        hra.vykresleniePola();

        hra.setPozX(2);
        hra.setPozY(2);
        hra.vyberPolickaPreZnak("x");
        hra.vykresleniePola();

        hra.setPozX(3);
        hra.setPozY(1);
        hra.vyberPolickaPreZnak("x");
        hra.vykresleniePola();

    }
}
