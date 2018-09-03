package com.company;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class Oblig1 {

    public static void main (String[] args){


        int[] a = {3,10,8,5,1,9,2,4,7,6};
        int[] c =  {4,3,1,5,6,10,9,7,8,2};
        int[] b = {};

        System.out.println(Arrays.toString(c));
        System.out.println("Maksverdien er: " + maks(c));
        //System.out.println("Ombyttinger er: " + ombyttinger(c));

        System.out.println(Arrays.toString(c));


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


}
