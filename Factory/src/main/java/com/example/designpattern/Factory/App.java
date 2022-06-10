package com.example.designpattern.Factory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Taste choco = TasteFactory.createTaste(TasteCode.Choco);
        System.out.println(choco);
        
        Taste spicy = TasteFactory.createTaste(TasteCode.Spicy);
        System.out.println(spicy);
        
        Taste cracker = TasteFactory.createTaste(TasteCode.Cracker);
        System.out.println(cracker);
    }
}
