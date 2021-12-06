package sk.uniza.fri;

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

        for (int i = 0; i <= this.velkostPola ; i++) {
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
        this.pozX = this.hodnotyXY(pozX);
    }

    public void setPozY(int pozY) {
        this.pozY = this.hodnotyXY(pozY);
    }

    public void vyberPolickaPreZnak(String znakHraca) {
        this.hraciaPlocha[this.pozX][this.pozY] = znakHraca;
    }

    // ak nie je obsadene vrati true
    public boolean obsadenostPolicka() {
        return this.hraciaPlocha[this.pozX][this.pozY].equals(" ");
    }

    public int hodnotyXY(int poz) {
        if ( this.velkostPola < poz * 2 - 1 || poz * 2 - 1 < 0) {
            System.out.println("Zlé čislo");
        } else {
            if (!this.obsadenostPolicka()) {
                return poz * 2 - 1;
            }

            System.out.println("Políčko je obsadené");

        }

        return poz;
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
        velkostPola = this.velkostPola / 2;

        if (cislo == velkostPola * velkostPola) {
            this.jePlnaHPlocha = true;
        }
        return this.jePlnaHPlocha;
    }

    //metoda pre urcenie ci hra ma dostatok rovnakych znakov pre ukoncenie hry
    public boolean vyhladavanieRovnakychZnakov(String znak, int pocetVitaznych) {
        int porovnavaniePoctu = 1;
        // orverovanie stlpca
        for(int i = 1; i < this.velkostPola; i += 2){
            if (!this.hraciaPlocha[this.pozX][i].equals(znak))
                break;
            if (porovnavaniePoctu == pocetVitaznych){
                return true;
            }

            porovnavaniePoctu++;
        }

        porovnavaniePoctu = 1;

        //overovanie riadku
        for(int i = 1; i < this.velkostPola; i += 2){
            if (!this.hraciaPlocha[i][this.pozY].equals(znak))
                break;
            if (porovnavaniePoctu == pocetVitaznych) {
                return true;
            }
        }

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
}
