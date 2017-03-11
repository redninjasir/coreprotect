import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Field extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Field()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600,1);
        addObject(new Core(), getWidth()/2, getHeight()/2);
        addObject(new Main(), 400,300);
        for(int i = 0;i<5;i++){
            int a = Greenfoot.getRandomNumber(getWidth());
            int b = Greenfoot.getRandomNumber(getHeight());
            addObject(new Enemy(), getWidth()-a,0);
            Main.health = 3;
        }
    }
    public void act(){
        printInfo();
    }
    public void printInfo(){
        showText("HP "+Main.health, 100, 100);
    }
}

