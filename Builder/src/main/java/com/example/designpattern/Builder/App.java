package com.example.designpattern.Builder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Submarine.Builder builder = new Submarine.Builder("bun");
    	Submarine sb = builder.cheese("Cheese").meat("Chicken").build();
    	System.out.println(sb);
    }
}
