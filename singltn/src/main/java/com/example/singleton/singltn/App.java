package com.example.singleton.singltn;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Parliment p = Parliment.getParliment();
        System.out.println(p);
    }
}
