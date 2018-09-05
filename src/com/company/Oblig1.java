package com.company;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Random;

public class Oblig1 {


    public static void main (String[] args){

        int[] a1 = {-4,-1,3,0,2,-3,-2,4,1};
        int[] a = {3, 10, 8, 5, 1, 9, 2, 4, 7, 6};
        int[] c =  {4, 3, 1, 5, 6, 10, 9, 7, 8, 2};
        int[] b = {10,6,5,41,3,2,1,0,20,111};
        int[] d = {1,2,3,4,5,6};

        char[] aBokstav = {'A','B','C','D','E','F','G','H','I','J'};


        System.out.println(Arrays.toString(aBokstav));
        //System.out.println("Maksverdien er: " + maks(c));
        //System.out.println("Ombyttinger er: " + ombyttinger(c));
        //delsortering(d);
        rotasjon(aBokstav);
        //System.out.println("Antall ulike: " + antallUlikeUsortert(b));

        System.out.println(Arrays.toString(aBokstav));


    }


    // Oppgave 1 - part 1

    public static int maks(int[] a){

        if(a.length < 1){
            throw new NoSuchElementException("Tabellen er tom!");
        }

        for(int i = 0; i < a.length - 1; i++){

            if(a[i] > a[i+1]){
                int maksverdi = a[i];
                a[i] = a[i+1];
                a[i+1] = maksverdi;
            }

        }

        return a[a.length - 1];
    }


    // Oppgave 1 - part 2

    public static int ombyttinger(int[] a){

        if(a.length < 1){
            throw new NoSuchElementException("Tabellen er tom!");
        }

        int ombytting = 0;

        for(int i = 0; i < a.length - 1; i++){

            if(a[i] > a[i+1]){

                int maksverdi = a[i];
                a[i] = a[i+1];
                a[i+1] = maksverdi;
                ombytting++;
            }

        }

        return ombytting;
    }


    // Oppgave 2

    public static int antallUlikeSortert(int[] a){

        if(a.length < 1){
            return 0;
        }

        for(int i = 0; i <a.length -1; i++){
            if(a[i] > a[i+1]){
                throw new IllegalStateException("Tabellen er ikke sortert stigende");
            }
        }


        int ulikeTall = 1;
        for(int j = 0; j < a.length - 1; j++){
            if(a[j] != a[j+1]){
                ulikeTall++;
            }
        }

        return ulikeTall;
    }

    // Oppgave 3

    public static int antallUlikeUsortert(int[] a) {

        if (a.length < 1) {
            return 0;
        }

        int maks = a[0];
        for(int i = 0; i < a.length - 1; i++){
            if(maks < a[i + 1]){
                maks = a[i + 1];
            }
        }

        int ulikeTall = 0;
        int k = 0;

            while (k <= maks) {
                for (int j = 0; j < a.length; j++) {
                    if (a[j] == k) {
                        ulikeTall++;
                        break;
                    }
                }
                k++;
            }
        return ulikeTall;
    }


        // Oppgave 4

    public static void delsortering(int[] a) {

        int antallOddetall = finnAntallOddetall(a);


        int v = 0;
        int h = a.length - 1;

        while(v < h){

            while (v < antallOddetall && h >= antallOddetall && a[v] % 2 != 0) v++;   // h er stoppverdi for v
            while (v < antallOddetall && h >= antallOddetall && a[h] % 2 == 0) h--;


                if((a[v] % 2) == 0 && (a[h] % 2) != 0){
                    bytt(a,v++,h--);

                } else if((a[v] % 2) == 0 && (a[h] % 2) == 0){
                    h--;

                } else if((a[v] % 2) != 0 && (a[h] % 2) != 0){
                    v++;

                }else if((a[v] % 2) != 0 && (a[h] % 2) == 0){
                    v++;
                    h--;

                }
        }
        Arrays.sort(a, 0, antallOddetall);
        Arrays.sort(a, antallOddetall, a.length);

    }

    public static int finnAntallOddetall(int[] a){
        int antallOddetall = 0;
        for (int i = 0; i < a.length; i++){
            if((a[i] % 2) != 0){

                antallOddetall++;
            }
        }
        return antallOddetall;
    }

    public static void bytt(int[] a, int i, int j)
    {
        int temp = a[i]; a[i] = a[j]; a[j] = temp;
    }



}
