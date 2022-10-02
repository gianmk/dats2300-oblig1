package no.oslomet.cs.algdat.Oblig1;

////// Løsningsforslag Oblig 1 ////////////////////////

import java.lang.UnsupportedOperationException;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Random;

public class Oblig1 {
    private Oblig1() {
    }

    ///// Oppgave 1 //////////////////////////////////////
    public static int maks(int[] a) {
        if (a.length <= 0) {
            throw new NoSuchElementException(" array inneholder ikke tall.");  // feil om det ikke er tall i array
        }

        for (int i = 1; i < a.length; i++) {  // for løkke som går gjennom array
            if (a[i - 1] > a[i]) {               // if state som bobler frem størst verdi.
                int temp = a[i];
                a[i] = a[i - 1];
                a[i - 1] = temp;
            }

        }

        return a[a.length - 1];  //returner siste verdi i array, som er største.
    }

    /* deloppgave
     Når blir det flest ombyttinger?
     Det er flest ombyttinger når det er synkende verdi fra venstre til høyre

     Når blir det færrest?
      Det er færrest når det er økende verdi  fra venstre til høyre




      Hvor mange blir det i gjennomsnitt?

      har laget en metode som regnet på gjennomsnitt ombyttinger. ved random 10 tall permutasjon er gjennomsnittet cirka 7.
      Vi vet at log(n)-0423 er gjennomsnitt for tall som er større enn det største av tallene foran, der n er antall ulike tall.
      Det er veldig få tall i gjennomsnitt som er større enn det største av tallene foran, derfor vil det skje en ombytting veldig ofte.
      Jo større n blir, jo mer øker gjennomsnittet for antall ombytting slik at jo større n, jo mer antall ombytting tilnærme tallet n.
      dette er da en mindre effektivt maks metode enn andre maks metode vi har sett på.





     */

    public static int ombyttinger(int[] a) {
        if (a.length <= 0) {
            throw new NoSuchElementException("Arrayet innerholder ikke tall");
        }


        int teller = 0;  // init en teller som teller all ombyttinger

        for (int i = 1; i < a.length; i++) {  // for løkke som kjører gjennom array
            if (a[i - 1] > a[i]) {   // sjekker om verdien er større enn verdien til høyre, dersom det er, vil de bytte plass og teller økes med 1
                teller++;
                int tall = a[i];
                a[i] = a[i - 1];
                a[i - 1] = tall;
            }

        }

        return teller;  // antall ombyttinger totalt

    }

    public static double gjennomsnitt() {
        double sum = 0;

        for (int i = 0; i < 10; i++) {
            int[] random = randPerm(10);
            sum += ombyttinger(random);
        }
        double gjennomsnitt = sum / 10;
        return gjennomsnitt;
    }

    public static int[] randPerm(int n)  // en effektiv versjon
    {
        Random r = new Random();         // en randomgenerator
        int[] a = new int[n];            // en tabell med plass til n tall
        for (int i = 0; i < n; i++)
            a[i] = i + 1;                  // legger inn tallene 1, 2, . , n

        for (int k = n - 1; k > 0; k--)  // løkke som går n - 1 ganger
        {
            int i = r.nextInt(k + 1);        // en tilfeldig tall fra 0 til k

            int temp = a[k];
            a[k] = a[i];
            a[i] = temp;
        }

        return a;                        // permutasjonen returneres
    }


    ///// Oppgave 2 //////////////////////////////////////
    public static int antallUlikeSortert(int[] a) {
        // throw new UnsupportedOperationException();
        if (a.length == 0) {
            return 0;    // returner 0 om array er tomt.
        }

        int antall = 1;

        for (int i = 1; i < a.length; i++) {  // looper gjennom array

            int tall1 = a[i - 1];
            int tall2 = a[i];

            if (tall1 > tall2) {
                throw new IllegalStateException("array er ikke sortert.");   // sjekker om array er sorter stigende.
            } else if (tall1 != tall2) {   // antall økes med 1 om tallet er større enn tallet etter.
                antall++;
            }

        }
        return antall;
    }


    ///// Oppgave 3 //////////////////////////////////////
    public static int antallUlikeUsortert(int[] a) {
        int teller = 0;

        if (a.length == 0) {                                 //returner 0 om array er tomt.
            return teller;
        }
        for (int i = 0; i < a.length; i++) {
            boolean like = false;                   // metode for å registrer om noen av tallen er like,
            for (int j = 0; j < i; j++) {
                if (a[j] == a[i]) {                       // sjekker om tall er like, og setter like = true om de er like
                    like = true;
                    break;
                }

            }
            if (!like) {                                // dersom like = false øker teller med 1.
                teller++;

            }

        }

        return teller;                // returner total like tall.
    }

    ///// Oppgave 4 //////////////////////////////////////
    public static void delsortering(int[] a) {


        int left = 0;  // oddetall til venstre
        int right = a.length - 1;  //partall skal til høyre

        while (left < right) {


            while (a[left] % 2 != 0 && left < right) {         // if venstrepeker er på et oddetall, vil det flytte til høyre
                left++;
            }

            while (a[right] % 2 == 0 && left < right) {         //dersom høyrepeker  er på et partall, vil det flytte til venstre
                right--;
            }
            if (left < right) {               // dersom venstrepeker er mindre enn høyrepeker, vil hjelpmetoden bytt() blir kalt, og tallene blir bytte om.
                bytt(a, left, right);
            }
        }


        if (partall(a)) {
            Arrays.sort(a);
        } else if (oddetall(a)) {
            Arrays.sort(a);

        } else {
            Arrays.sort(a, 0, left);
            Arrays.sort(a, left, a.length);
        }
    }

    // hjelpe metode for oppgave 4
    public static void bytt(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static boolean partall(int[] a) { // hjelpemetode for å finne om array inneholder kun partall

        boolean partall = true;

        for (int j : a) {
            if (j % 2 != 0) {
                partall = false;
                break;
            }
        }
        return partall;
    }

    public static boolean oddetall(int[] a) { //sjekk om array kun inneholder oddetall.

        boolean oddetall = true;

        for (int j : a) {
            if (j % 2 == 0) {
                oddetall = false;
                break;
            }
        }
        return oddetall;

    }


    ///// Oppgave 5 //////////////////////////////////////
    public static void rotasjon(char[] a) {
        if (a.length <= 0) {              //sjekker at array er valid
            return;
        }

        char rotere = a[a.length - 1];                // lage en hjelp array for å lagre sister verdi
        for (int i = a.length - 1; i > 0; i--) {  // looper gjennom array og bytte plass.
            a[i] = a[i - 1];

        }
        a[0] = rotere; // setter siste verdi som første.
    }


    ///// Oppgave 6 //////////////////////////////////////
    public static void rotasjon(char[] a, int k) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 7 //////////////////////////////////////

    public static String flett(String s, String t) {


        int min = Math.min(s.length(), t.length());  // finne minste string

        StringBuilder tegn = new StringBuilder();  // lage ny tabell

        for (int i = 0; i < min; i++) {   // for løkke som kjører gjennom S og T.


            tegn.append(s.charAt(i)).append(t.charAt(i)); // fletting mellom s og T ,annen hver bokstav.
        }

        tegn.append(s.substring(min)).append(t.substring(min));

        return tegn.toString();
    }


    /// 7b)
  /*  public static String flett(String... s) {

        int teller = 0;


        for (int i = 0; i < s.length; i++) {   // for løkke kjører gjenom ordene til "s"


            for (int j = 0; j < s[i].length(); j++) {  // for løkke som teller hvor mange  tegn totalt
                teller++;
            }
        }

        String out = "";


        for (int i = 0; i < teller; i++) {  // løkke kjører gjennom alle tegn til s


            for (int j = 0; j < s.length; j++) {  // legges til string out for hvert tegn løkke går gjennom


                if (i < s[j].length()) {
                    out = out + s[j].charAt(i);
                }
            }
        }
        return out;
    }*/
    public static String flett(String... s) {

        StringBuilder out = new StringBuilder();

        boolean siste = false;
        int i = 0;
        while (!siste) {
            siste = true;
            //Antar at den runden vi er paa er den siste

            for (int j = 0; j < s.length; j++) { //gaar gjennom alle stings
                if (s[j].length() > i) {        //sjekker om den har flere char
                    out.append(s[j].charAt(i)); //Hvis det er flere saa vil den sette den inn

                    siste = false;              //Hvis ikke saa vil den iterere paa nytt.
                }
            }
            i++;

        }
        return out.toString();
    }

    ///// Oppgave 8 //////////////////////////////////////
    public static int[] indekssortering(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 9 //////////////////////////////////////
    public static int[] tredjeMin(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 10 //////////////////////////////////////
    public static int bokstavNr(char bokstav) {
        throw new UnsupportedOperationException();
    }

    public static boolean inneholdt(String a, String b) {
        throw new UnsupportedOperationException();
    }

}


//}  // Oblig1
