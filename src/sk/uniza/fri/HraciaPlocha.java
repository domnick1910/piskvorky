package sk.uniza.fri;

public class HraciaPlocha {
    private int velkostPola;
    private int pozX;
    private int pozY;
    private Policko[][] policka;

    public HraciaPlocha(int velkostPola) {
        this.pozX = 0;
        this.pozY = 0;
        this.velkostPola = velkostPola;

        // velkolstPole + 1 pre jednoduchsie zadavanie pozicie
        this.policka = new Policko[velkostPola + 1][velkostPola + 1];

        for (int i = 1; i <= this.velkostPola; i++) {
            for (int j = 1; j <= this.velkostPola ; j++) {
                this.policka[i][j] = new Policko(" ", StavPolicka.VOLNE);
            }
        }
    }

    public void vykresleniePola() {
        //horizontalny riadok s cislami
        for (int i = 0; i < this.policka.length * 2; i++) {
            if (i == 0 || i % 2 == 1) {
                System.out.print(" ");
            } else {
                System.out.print(i / 2);
            }
        }

        System.out.println();
        int poziciaX = 0;
        for (int i = 0; i <= this.velkostPola * 2; i++) {
            if (i % 2 == 1) {
                poziciaX++;
            }
            int poziciaY = 0;
            for (int j = 0; j <= this.velkostPola * 2; j++) {
                if (j % 2 == 1) {
                    poziciaY++;
                }
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
                    System.out.print(this.policka[poziciaX][poziciaY].getZnak());
                }
            }
            System.out.println();
        }
    }

    public void setPozX(int pozX) {
        this.pozX = pozX;
    }

    public void setPozY(int pozY) {
        this.pozY = pozY;
    }

   public void vyberPolickaPreZnak(String znakHraca) {
        this.policka[this.pozX][this.pozY].setZnak(znakHraca);
    }
/*
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

}
