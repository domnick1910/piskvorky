package sk.uniza.fri;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 2. 12. 2021 - 19:08
 *
 * @author PC
 */
class HraTest {
    private Hra hraTest;

    @BeforeEach
    void setUp() {
        this.hraTest = new Hra(3);
    }

    @Test
    void hodnotyXY() {

        Assertions.assertEquals(1, this.hraTest.hodnotyXY(1));
        Assertions.assertEquals(3, this.hraTest.hodnotyXY(2));
        Assertions.assertEquals(5, this.hraTest.hodnotyXY(3));
        //overenie pri zlom výsledku
        Assertions.assertEquals(4, this.hraTest.hodnotyXY(4));
    }

    @Test
    void vykresleniePola() {
        this.hraTest.vykresleniePola();
    }

    @Test
    void getJePlnaHPlocha() {
        Assertions.assertTrue(this.hraTest.getJePlnaHPlocha(9));
    }

    @Test
    void vykreslenieFor() {
        this.hraTest.vykreslenieFor();
    }
}
