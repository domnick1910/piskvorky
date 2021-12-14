package sk.uniza.fri;

/**
 * 2. 12. 2021 - 19:08
 *
 * @author PC
 */
public class Logika {
    private HraciaPlocha hraciaPlocha;
    private Hrac[] hrac;
    private int pocetHracov;
    private int velkostHracejPlochy;

    public Logika(int pocetHracov) {
        this.vypocetHracejPlochy(pocetHracov);
        this.hraciaPlocha = new HraciaPlocha(this.velkostHracejPlochy);
    }

    public void vypocetHracejPlochy(int pocetHracov) {
        if (pocetHracov == 1) {
            this.velkostHracejPlochy= 3;
        }

        if (pocetHracov > 3) {
            this.velkostHracejPlochy = pocetHracov + 1;
        }
    }

    // Ak bude hracia plocha plna,
    // da na vyber ci obnovit hraciu plochu, alebo ma skoncit
    public void obnovaHracejPlochy(String znak) {
        switch (znak) {
            case "Y": System.out.println();
                break;
            case "N": System.out.println("A");
                break;
            default: System.out.println("Zlý znak");
                break;
        }
    }
}
