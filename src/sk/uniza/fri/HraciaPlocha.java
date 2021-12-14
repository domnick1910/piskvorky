package sk.uniza.fri;



public class HraciaPlocha {
    private final String[][] hraciaPlocha;
    private final int velkostPola;
    private int pozX;
    private int pozY;
    private boolean jePlnaHPlocha;

    public HraciaPlocha(int velkostPola) {
        this.jePlnaHPlocha = false;
        this.pozX = 0;
        this.pozY = 0;
        this.velkostPola = velkostPola * 2;

        // this.velskostPola + 1 ,  5 znakov 01234 + 1 pre dosiahnutie 5
        this.hraciaPlocha = new String[this.velkostPola + 1][this.velkostPola + 1];

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

    // ak je obsadene vrati false
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
    }

    public boolean hladanieAntiDiagonaly(String znak) {
        int porovnavaniePoctu = 1;
        //diagonala od n n po 1 n resp. antidiagonala
        for (int i = 1; i < this.velkostPola; i += 2) {
            for (int j = 1; j < this.velkostPola; j += 2) {
                // Condition for secondary diagonal
                if ((i + j) == this.velkostPola - 1) {
                    if (!this.hraciaPlocha[i][j].equals(znak)) {
                        break;
                    }
                    porovnavaniePoctu++;
                    if (porovnavaniePoctu == 3) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int getPozY() {
        return this.pozY;
    }

    public int getVelkostPola(){
        int velskotPola;
        velskotPola = this.velkostPola / 2;
        return velskotPola * velskotPola;
    }

    public int getPozX() {
        return this.pozX;
    }
}
