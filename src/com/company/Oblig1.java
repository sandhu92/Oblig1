package com.company;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class Oblig1 {

    public static void main (String[] args){


        int[] a = {3, 10, 8, 5, 1, 9, 2, 4, 7, 6};
        int[] c =  {4, 3, 1, 5, 6, 10, 9, 7, 8, 2};
        int[] b = {};
        int[] d = {3, 3, 4, 5, 5, 6, 7, 7, 7, 8};

        System.out.println(Arrays.toString(d));
        //System.out.println("Maksverdien er: " + maks(c));
        //System.out.println("Ombyttinger er: " + ombyttinger(c));
        System.out.println("Antall ulike: " + antallUlikeSortert(d));

        System.out.println(Arrays.toString(d));


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

    public static int antallUikeUsortert(int[] a){

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

}
