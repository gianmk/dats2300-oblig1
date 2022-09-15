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
            throw new NoSuchElementException(" array inneholder ikke tall.");
        }

        for(int i = 1; i < a.length; i++){

            if(a[i-1]>a[i]){
                int temp = a[i];
                a[i]=a[i-1];
                a[i-1] = temp;
            }

        }

        return a[a.length-1];
    }

    public static int ombyttinger(int[] a) {
        if(a.length <= 0){
            throw new NoSuchElementException("Arrayet innerholder ikke tall");
        }


        int antallBytte = 0;

        for(int i = 1; i < a.length; i++){
            if(a[i-1]>a[i]){
               antallBytte++;
                int tall = a[i];
                a[i]=a[i-1];
                a[i-1] = tall;
            }

        }

        return antallBytte;

    }

    ///// Oppgave 2 //////////////////////////////////////
    public static int antallUlikeSortert(int[] a) {
        // throw new UnsupportedOperationException();
        if(a.length==0){
            return 0;
        }

        int antall = 1;

        for(int i = 1; i< a.length; i++){

            int tall1 = a[i-1];
            int tall2 = a[i];

            if(tall1>tall2){
                throw new IllegalStateException("array er ikke sortert.");
            }


            else if(tall1!=tall2){
                antall++;
            }

        }
        return antall;
    }



    ///// Oppgave 3 //////////////////////////////////////
    public static int antallUlikeUsortert(int[] a)  {
        int ulike = 0;

        if(a.length == 0) {                                 //sjekker om array er tomt
            return 0;
        }
        for(int i = 0; i < a.length;i++){
            boolean ikkeUlike = false;
            for(int j = 0;j< i ; j++){
                if(a[j] == a[i]) {
                    ikkeUlike = true;
                    break;
                }

            }
            if (!ikkeUlike){
                ulike++;

            }

        }

        return ulike;
    }

    ///// Oppgave 4 //////////////////////////////////////
    public static void delsortering(int[] a) {

        int left = 0;
        int right = a.length-1;

        for(int i = 0; i < a.length-1; i++){


            while(a[left] % 2 != 0){
                left++;
            }

            while(a[right] % 2 == 0){
                right--;
            }
            if(left < right){
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

            char rotere = a[a.length - 1];
            for (int i = a.length - 1; i > 0; i--) {
                a[i] = a[i - 1];

            }
            a[0] = rotere;
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
