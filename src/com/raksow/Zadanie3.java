package com.raksow;

public class Zadanie3
{
    public static void wykonaj()
    {
        int[] tab2 = new int[]{4, 5, 6};
        int[] tab1 = new int[]{1, 2, 3};

        int[] tablice = tablica(tab1, tab2);

        for(int i = 0; i < tablice.length; i++)
        {
            System.out.println(tablice[i]);
        }
    }
    public static int[] tablica(int[] tab1, int[] tab2)
    {
        if(tab1.length == tab2.length)
        {
            int[] tab = new int[tab1.length];
            for (int i = 0; i < tab1.length; i++) {
                tab[i] = tab1[i] + tab2[i];
            }
            return tab;
        }
        else
        {
            return new int[3];
        }
    }
}
