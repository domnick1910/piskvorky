package sk.uniza.fri;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int velkostPola;
        //funkcnost pre kazdé čislo vačšie ako 3 až po n++
        System.out.println("Zadajte velkost hraciej plochy od 3 po 9");

        velkostPola = sc.nextInt();

        Hra hra = new Hra(velkostPola);


    }
}
