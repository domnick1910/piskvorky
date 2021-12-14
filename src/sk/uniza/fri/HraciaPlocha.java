package sk.uniza.fri;


import java.util.ArrayList;

public class HraciaPlocha {
    private int velkostPola;
    private int pozX;
    private int pozY;
    private Policko[][] policka;

    public HraciaPlocha(int velkostPola) {
        this.pozX = 0;
        this.pozY = 0;
        this.velkostPola = velkostPola;
        this.policka = new Policko[velkostPola + 1][velkostPola + 1];


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
                if (i % 2 == 0) {
                    System.out.print("-");
                } else if (j % 2 == 0) {
                    System.out.print("|");;
                } else {
                    //nahradit getZnak
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void setPozX(int pozX) {

    }

    public void setPozY(int pozY) {
    }

   /* public void vyberPolickaPreZnak(String znakHraca) {
        this.hraciaPlocha[this.pozX][this.pozY] = znakHraca;
    }

    public boolean hladanieVRiadku(String znak) {
        int porovnavaniePoctu = 1;
        // orverovanie riadku -> ok
        for (int i = 1; i < this.velkostPola; i += 2) {
            if (!this.hraciaPlocha[this.pozX][i].equals(znak))
                break;
            if (porovnavaniePoctu == 3) {
                return true;
            }

            porovnavaniePoctu++;
        }
        return false;
    }

    public boolean hladanieVStlpci(String znak) {
        int porovnavaniePoctu = 1;
        //overovanie stlpca  -> ok
        for(int i = 1; i < this.velkostPola; i += 2){
            if (!this.hraciaPlocha[i][this.pozY].equals(znak))
                break;
            if (porovnavaniePoctu == 3) {
                return true;
            }
            porovnavaniePoctu++;
        }
        return false;
    }

    //metoda pre urcenie ci hra ma dostatok rovnakych znakov pre ukoncenie hry
    public boolean hladanieDiagonaly(String znak) {
        int porovnavaniePoctu = 1;
        // diagonála od 1 1 po n n
        for (int i = 1; i < this.velkostPola; i += 2) {
            for (int j = 1; j < this.velkostPola; j += 2) {
                if (!this.hraciaPlocha[i][j].equals(znak)) {
                    break;
                }
                porovnavaniePoctu++;
                if (porovnavaniePoctu == 3) {
                    return true;
                }
            }
        }
        return false;
    }*/

    public int getPozX() {
        return this.pozX;
    }

    public int getPozY() {
        return this.pozY;
    }

}
