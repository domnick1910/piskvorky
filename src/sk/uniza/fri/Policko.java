package sk.uniza.fri;

/**
 * 2. 12. 2021 - 19:08
 *
 * @author PC
 */
public class Policko {
    private StavPolicka  StavPolicka;
    private String znak;


    public Policko(String znak) {
        this.StavPolicka = sk.uniza.fri.StavPolicka.VOLNE; //vymazat pri importe do BlueJ
        this.znak = znak;
    }

    public void setStavPolicka() {
        if (this.StavPolicka != sk.uniza.fri.StavPolicka.VOLNE) {
            this.StavPolicka = sk.uniza.fri.StavPolicka.VOLNE;
        }
    }

    public StavPolicka getStavPolicka(){
        return this.StavPolicka;
    }

    public void setZnak(String znak) {
        this.znak = znak;
    }
    public String getZnak() {
        return this.znak;
    }
}
