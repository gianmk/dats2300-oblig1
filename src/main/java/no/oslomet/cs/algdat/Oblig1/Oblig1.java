package no.oslomet.cs.algdat.Oblig1;

////// Løsningsforslag Oblig 1 ////////////////////////

import java.lang.UnsupportedOperationException;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Oblig1 {
    private Oblig1() {}

    ///// Oppgave 1 //////////////////////////////////////
    public static int maks(int[] a) {
        if (a.length <= 0) {
            throw new NoSuchElementException(" array inneholder ikke tall.");  // feil om det ikke er tall i array
        }

        for(int i = 1; i < a.length; i++){  // for løkke som går gjennom array
            if(a[i-1]>a[i]){               // if state som bobler frem størst verdi.
                int temp = a[i];
                a[i]=a[i-1];
                a[i-1] = temp;
            }

        }

        return a[a.length-1];  //returner siste verdi i array, som er største.
    }

    /* deloppgave
     Når blir det flest ombyttinger?
     Det er flest ombyttinger når det er synkende verdi fra venstre til høyre

     Når blir det færrest?
      Det er færrest når det er økende verdi  fra venstre til høyre

     */

    public static int ombyttinger(int[] a) {
        if(a.length <= 0){
            throw new NoSuchElementException("Arrayet innerholder ikke tall");
        }


        int teller = 0;  // init en teller som teller all ombyttinger

        for(int i = 1; i < a.length; i++){  // for løkke som kjører gjennom array
            if(a[i-1]>a[i]){   // sjekker om verdien er større enn verdien til høyre, dersom det er, vil de bytte plass og teller økes med 1
               teller++;
                int tall = a[i];
                a[i]=a[i-1];
                a[i-1] = tall;
            }

        }

        return teller;  // antall ombyttinger totalt

    }

    ///// Oppgave 2 //////////////////////////////////////
    public static int antallUlikeSortert(int[] a) {
        // throw new UnsupportedOperationException();
        if(a.length==0){
            return 0;    // returner 0 om array er tomt.
        }

        int antall = 1;

        for(int i = 1; i< a.length; i++){  // looper gjennom array

            int tall1 = a[i-1];
            int tall2 = a[i];

            if(tall1>tall2){
                throw new IllegalStateException("array er ikke sortert.");   // sjekker om array er sorter stigende.
            }


            else if(tall1!=tall2){   // antall økes med 1 om tallet er større enn tallet etter.
                antall++;
            }

        }
        return antall;
    }



    ///// Oppgave 3 //////////////////////////////////////
    public static int antallUlikeUsortert(int[] a)  {
        int teller = 0;

        if(a.length == 0) {                                 //returner 0 om array er tomt.
            return teller;
        }
        for(int i = 0; i < a.length;i++){
            boolean like = false;                   // metode for å registrer om noen av tallen er like,
            for(int j = 0;j< i ; j++){
                if(a[j] == a[i]) {                       // sjekker om tall er like, og setter like = true om de er like
                    like = true;
                    break;
                }

            }
            if (!like){                                // dersom like = false øker teller med 1.
                teller++;

            }

        }

        return teller;                // returner total like tall.
    }

    ///// Oppgave 4 //////////////////////////////////////
    public static void delsortering(int[] a) {

        int left = 0;  // oddetall til venstre
        int right = a.length-1;  //partall skal til høyre

        for(int i = 0; i < a.length-1; i++){  //looper gjennom array for å sortere odde- og parttall


            while(a[left] % 2 != 0){         // if venstrepeker er på et oddetall, vil det flytte til høyre
                left++;
            }

            while(a[right] % 2 == 0){         //dersom høyrepeker  er på et partall, vil det flytte til venstre
                right--;
            }
            if(left < right){               // dersom venstrepeker er mindre enn høyrepeker, vil hjelpmetoden bytt() blir kalt, og tallene blir sortert om.
                bytt(a, left, right);
            }
        }

        Arrays.sort(a, 0, left);
        Arrays.sort(a, left, a.length);
    }
    // hjelpe metode for oppgave 4
    public static void bytt(int[] a, int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }




    ///// Oppgave 5 //////////////////////////////////////
    public static void rotasjon(char[] a) {
        if(a.length <= 0){              //sjekker at array er valid
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
    public static String flett(String... s) {

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


}  // Oblig1
