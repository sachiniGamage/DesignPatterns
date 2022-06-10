package com.example.designpattern.Prototype;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ShapeCache sc = new ShapeCache();
        Circle c = (Circle) sc.getShape(ShapeType.circle);
        System.out.println(c);
        
        c.setDiameter(6);
        System.out.println(c);
        
        Circle c2 = (Circle) sc.getShape(ShapeType.circle);
        System.out.println(c2);
    }
}
