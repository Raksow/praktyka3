package com.raksow;

public class Zadanie5
{
    public static void wykonaj()
    {
        System.out.println(dziel(15,12));
    }

    public static int dziel(int a, int b) // 10 15
    {
        int c = 0;
        int wynik = 0;
        if(a < b)
        {
            c = a;
        }
        else
        {
            c = b;
        }

        for(int i = c; i > 0; i--)
        {
            if(a % i == 0 && b % i == 0)
            {
                wynik = i;
                break;
            }
        }
        return wynik;
    }
}
