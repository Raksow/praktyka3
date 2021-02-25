package com.raksow;

import java.util.Arrays;
import java.util.Scanner;

public class Zadanie2
{
    public static void wykonaj()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj wielkosc tablicy:");
        int x = scan.nextInt();
        System.out.println("Podaj pierwsza liczbe tablicy:");
        int y = scan.nextInt();

        int[] tab = new int[x];
        wpisywanie(tab, y);                                        //wpisuje do tablicy

        wys(tab);                                                  //wyswietla tablice

        System.out.println("Min: " + min(tab));                    //podaje min liczbe tablicy

        System.out.println("Max: " + max(tab));                    //podaje max liczbe tablicy

        System.out.println("Suma: " + suma(tab));                  //podaje sume liczb tablicy

        System.out.println("Srednia: " + srednia(tab));            //podaje srednia liczb tablicy

        System.out.println("Mediana: " + mediana(tab));            //podaje mediane liczb tablicy
    }

    public static void wpisywanie(int[] tab, int y)
    {
        tab[0] = y;

        if(y % 2 != 0)
        {
            y += 1;
        }
        else
        {
            y += 2;
        }
        for(int i = 1; i < tab.length; i++)
        {
            tab[i] = y;
            y += 2;
        }
    }

    public static void wys(int[] tab)
    {
        for(int i = 0; i < tab.length; i++)
        {
            System.out.println(tab[i]);
        }
        System.out.println("");
    }

    public static int min(int[] tab)
    {
        return tab[0];
    }

    public static int max(int[] tab)
    {
        return tab[tab.length - 1];
    }

    public static int suma(int[] tab)
    {
        int suma = 0;
        for(int a : tab)
        {
            suma += a;
        }
        return suma;
    }

    public static float srednia(int[] tab)
    {
        float suma = 0;
        for(int a : tab)
        {
            suma += a;
        }
        return suma / tab.length;
    }

    public static double mediana(int[] tab)
    {
        double srednia;
        double mediana;

        if(tab.length % 2 == 0)
        {
            srednia = tab[tab.length/2] + tab[(tab.length/2) - 1];
            mediana = srednia / 2.0;
        }
        else
        {
            mediana = tab[tab.length/2];
        }
        return mediana;
    }
}
