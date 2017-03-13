import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class start extends World
{

    /**
     * Constructor for objects of class start.
     * 
     */
    public start()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 200, 1); 
        addObject(new Logo(),300,100);
        addObject(new easy(), 200, 195);
        addObject(new medium(), 300,195);
        addObject(new hard(), 400,195);
    }
    public void act(){
       
    }
}
