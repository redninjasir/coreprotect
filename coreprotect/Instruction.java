import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instruction here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instruction extends World
{

    /**
     * Constructor for objects of class Instruction.
     * 
     */
    public Instruction()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(new pic(), 300,200);
        showText("Press enter to continue", 270, 300);
    }
    public void act(){
        click();
    }
    public void click(){
        if(Greenfoot.isKeyDown("enter")||Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new menu());
        }
    }
}
