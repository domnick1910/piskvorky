package sk.uniza.fri;

import java.util.ArrayList;

/**
 * 2. 12. 2021 - 19:08
 *
 * @author PC
 */
public class Logika {
    private HraciaPlocha hraciaPlocha;
    private int pocetHracov;
    private int velkostHracejPlochy;
    private boolean jeKoniec;

    public Logika(int pocetHracov, ArrayList<Hrac> hraci) {
        this.jeKoniec = false;
        this.vypocetHracejPlochy(pocetHracov);
        this.hraciaPlocha = new HraciaPlocha(this.velkostHracejPlochy);
    }

    public void vypocetHracejPlochy(int pocetHracov) {
        // podmienka pre zaporne cisla dat do main class
        if (pocetHracov == 1) {
            this.velkostHracejPlochy = 3;
        }

        if (pocetHracov > 3) {
            this.velkostHracejPlochy = pocetHracov + 1;
        }
    }

    // Ak bude hracia plocha plna,
    // da na vyber ci obnovit hraciu plochu, alebo ma skoncit
    public void obnovaHracejPlochy(String znak) {
        switch (znak) {
            case "Y": this.hraciaPlocha.vykresleniePola();
                break;
            case "N": this.jeKoniec = true;
                break;
            default: System.out.println("Zlý znak");
                break;
        }
    }

    public boolean vyhra(String znak) {
        if (!this.hraciaPlocha.hladanieVRiadku(znak)) {
            return true;
        }

        if (!this.hraciaPlocha.hladanieVStlpci(znak)) {
            return true;
        }

        if (!this.hraciaPlocha.hladanieDiagonaly(znak)) {
            return true;
        }

        if (!this.hraciaPlocha.hladanieAntiDiagonaly(znak)) {
            return  true;
        }

        return  false;
    }

    public boolean getJeKoniec() {
        return this.jeKoniec;
    }


}
