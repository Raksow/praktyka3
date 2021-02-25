package com.raksow;

import java.util.Scanner;

public class Zadanie1
{
    public static void wykonaj()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj rozmiar tablicy");
        int x = scan.nextInt();
        String[] tab = new String[x];
        wpisywanie(tab);
        wys(tab);
    }

    public static void wpisywanie(String[] tab)
    {
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < tab.length; i++)
        {
            tab[i] = scan.nextLine();
        }
    }

    public static void wys(String[] tab)
    {
        for(int i = 0; i < tab.length; i++)
        {
            System.out.println(tab[i]);
        }
    }
}
