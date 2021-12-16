package sk.uniza.fri;

/**
 * 2. 12. 2021 - 19:08
 *
 * @author PC
 */
public class Policko {
    private StavPolicka StavPolicka;
    private String znak;


    public Policko(String znak, StavPolicka stavPolicka) {
        this.StavPolicka = stavPolicka; //vymazat pri importe do BlueJ
        this.znak = znak;
    }
    // zmeni stav policka (obsadene = volne / volne = obsadene)
    public void setStavPolicka() {
        if (this.StavPolicka != this.StavPolicka.VOLNE) {
            this.StavPolicka = this.StavPolicka.VOLNE;
        } else {
            this.StavPolicka = this.StavPolicka.OBSADENE;
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
