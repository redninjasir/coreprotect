import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Scanner;
/**
 * Write a description of class menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class menu extends World
{
    public static String name;
    /**
     * Constructor for objects of class menu.
     * 
     */
    public menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 200, 1); 
        addObject(new Logo(), 300,100);
    }
    public void act(){
        addObject(new easy(), 200, 195);
        addObject(new medium(), 300,195);
        addObject(new hard(), 400,195);
    }
}
