package no.oslomet.cs.algdat.Oblig1;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Denne klassen kan du bruke til hjelp under utvikling av din oblig.
 * Lag små og enkle test-eksempler for å teste at metoden din fungerer som ønsket.
 */
class Oblig1UnitTest {

    @org.junit.jupiter.api.Test
    void maks() {
        int[] tall = {0,1,2,3,4,5,6,7,8,9};
        assertEquals(9, Oblig1.maks(tall), "Implementer maks og denne testen");
    }


    @org.junit.jupiter.api.Test
        void ombyttinger() {
            int[] tall = {9,8,7,6,5,4,3,2,1,0};
            int[] random = Oblig1Test.randPerm(10);
            assertEquals(9, Oblig1.ombyttinger(tall), "Implementer ombyttinger og denne testen");
        }

    @org.junit.jupiter.api.Test
    void antallUlikeSortert() {
        int[] tall= {3,3,4,5,5,6,7,7,7,8,9};
        assertEquals(7, Oblig1.antallUlikeSortert(tall), "Implementer antallUlikeSortert og denne testen");
    }

    @org.junit.jupiter.api.Test
    void antallUlikeUsortert() {
        assertEquals(true, false, "Implementer antallUlikeUsortert og denne testen");
    }

    @org.junit.jupiter.api.Test
    void delsortering() {
        assertEquals(true, false, "Implementer delsortering og denne testen");
    }

    @org.junit.jupiter.api.Test
    void rotasjon() {
        assertEquals(true, false, "Implementer rotasjon og denne testen");
    }

    @org.junit.jupiter.api.Test
    void flett() {
        assertEquals(true, false, "Implementer flett og denne testen");
    }

    @org.junit.jupiter.api.Test
    void indekssortering() {
        assertEquals(true, false, "Implementer indekssortering og denne testen");
    }

    @org.junit.jupiter.api.Test
    void tredjeMin() {
        assertEquals(true, false, "Implementer tredjeMin og denne testen");
    }

    @org.junit.jupiter.api.Test
    void bokstavNr() {
        assertEquals(true, false, "Implementer bokstavNr og denne testen");
    }

    @org.junit.jupiter.api.Test
    void inneholdt() {
        assertEquals(true, false, "Implementer inneholdt og denne testen");
    }
}