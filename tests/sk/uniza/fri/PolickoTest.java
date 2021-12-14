package sk.uniza.fri;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 2. 12. 2021 - 19:08
 *
 * @author PC
 */
class PolickoTest {
    private Policko polickoVolne;
    private Policko polickoObsadene;
    @BeforeEach
    void setUp() {
        this.polickoVolne = new Policko("x", StavPolicka.VOLNE);
        this.polickoObsadene = new Policko(" ", StavPolicka.OBSADENE);
    }

    @Test
    void setStavPolicka() {
       this.polickoVolne.setStavPolicka();
       Assertions.assertEquals(StavPolicka.OBSADENE, this.polickoVolne.getStavPolicka());

       this.polickoObsadene.setStavPolicka();
       Assertions.assertEquals(StavPolicka.VOLNE, this.polickoObsadene.getStavPolicka());
    }






}