package sk.uniza.fri;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 2. 12. 2021 - 19:08
 *
 * @author PC
 */
class HraTest {
    private HraciaPlocha hraTest;

    @BeforeEach
    void setUp() {
        this.hraTest = new HraciaPlocha(5);
    }

    /*@Test
    void hodnotyXY() {
        this.hraTest.setPozX(1);
        Assertions.assertEquals(1, this.hraTest.getPozX());
        this.hraTest.setPozX(2);
        Assertions.assertEquals(3, this.hraTest.getPozX());
        this.hraTest.setPozX(3);
        Assertions.assertEquals(5, this.hraTest.getPozX());
        //overenie pri zlom výsledku
        this.hraTest.setPozX(4);
        Assertions.assertEquals(5, this.hraTest.getPozX());
        this.hraTest.setPozX(5);
        Assertions.assertEquals(5, this.hraTest.getPozX());

    }*/

    @Test
    void vykresleniePola() {
        this.hraTest.setPozX(5);
        this.hraTest.setPozY(5);
        this.hraTest.vyberPolickaPreZnak("x");
        this.hraTest.vykresleniePola();
    }



   /*@Test
    // test riadku
    void vyhladavanieRovnakychZnakov() {
        this.hraTest.setPozX(2);
        this.hraTest.setPozY(1);
        this.hraTest.vyberPolickaPreZnak("x");

        this.hraTest.setPozX(2);
        this.hraTest.setPozY(2);
        this.hraTest.vyberPolickaPreZnak("x");
        this.hraTest.setPozX(2);
        this.hraTest.setPozY(3);
        this.hraTest.vyberPolickaPreZnak("x");
        //Assertions.assertTrue(this.hraTest.vyhladavanieRovnakychZnakov("x", 3));
    }

    @Test
    //test stlpca
    void vyhladavanieRovnakychZnakovVS() {
        //this.hraTest.inicializaciaHracejPlochy();
        this.hraTest.setPozX(2);
        this.hraTest.setPozY(2);
        this.hraTest.vyberPolickaPreZnak("x");

        this.hraTest.setPozX(3);
        this.hraTest.setPozY(3);
        this.hraTest.vyberPolickaPreZnak("x");

        this.hraTest.setPozX(4);
        this.hraTest.setPozY(4);
        this.hraTest.vyberPolickaPreZnak("x");
        //Assertions.assertFalse(this.hraTest.vyhladavanieRovnakychZnakov("x", 3));
    }*/

}
