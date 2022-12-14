package no.oslomet.cs.algdat.Oblig1;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Denne klassen kan du bruke til hjelp under utvikling av din oblig.
 * Lag små og enkle test-eksempler for å teste at metoden din fungerer som ønsket.
 */
class Oblig1UnitTest {

    @org.junit.jupiter.api.Test
    void maks() {
        int[] tall = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertEquals(9, Oblig1.maks(tall), "Implementer maks og denne testen");
    }


    @org.junit.jupiter.api.Test
    void ombyttinger() {
        int[] tall = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] random = Oblig1Test.randPerm(10);
        assertEquals(9, Oblig1.ombyttinger(tall), "Implementer ombyttinger og denne testen");
    }

    @org.junit.jupiter.api.Test
    void antallUlikeSortert() {
        int[] tall = {3, 3, 3, 3, 4, 4, 5, 5, 7, 8, 9};
        assertEquals(6, Oblig1.antallUlikeSortert(tall), "Implementer antallUlikeSortert og denne testen");
    }

    @org.junit.jupiter.api.Test
    void antallUlikeUsortert() {
        int[] tall = {1, 2, 3, 4, 4, 4};
        assertEquals(4, Oblig1.antallUlikeSortert(tall), "Implementer antallUlikeUsortert og denne testen");
    }

    @org.junit.jupiter.api.Test
    void delsortering() {
        int[] forventer = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};
        int[] a = {6, 10, 9, 4, 1, 3, 8, 5, 2, 7};
        Oblig1.delsortering(a);
        assertEquals(Arrays.toString(forventer), Arrays.toString(a), "Implementer delsortering og denne testen");
    }

    @org.junit.jupiter.api.Test
    void rotasjon() {
        char[] bokstav = {'H', 'O', 'A', 'N', 'G'};
        Oblig1.rotasjon(bokstav);
        char[] rotertBokstav = {'G', 'H', 'O', 'A', 'N'};
        assertEquals(Arrays.toString(rotertBokstav), Arrays.toString(bokstav), "Implementer rotasjon og denne testen");
    }

    @org.junit.jupiter.api.Test
    void flett() {
        String a = "ACEG";
        String b = "BDFH";
        String c = "";
        assertEquals("ABCDEFGH", Oblig1.flett(a, b), "Implementer flett og denne testen");
        assertEquals("ABCDEFGH", Oblig1.flett(a, b, c), "Implementer flett og denne testen");
    }

}

