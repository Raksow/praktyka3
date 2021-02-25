package com.raksow;

public class Zadanie4
{
    public static void wykonaj()
    {
        int [][] tab = new int[3][2];

        tablica(tab);
    }

    public static void tablica(int[][] tab)
    {
        for(int i = 0; i < tab.length; i++)
        {
            for(int j = 0; j < tab[i].length; j++)
            {
                System.out.print(tab[i][j]);
            }
            System.out.println();
        }
    }

}
