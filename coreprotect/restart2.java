import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class restart2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class restart2 extends Actor
{
    /**
     * Act - do whatever the restart2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        click();
    }    
    public void click(){
        //when click retry the level
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new Field());
        }
    }
}
