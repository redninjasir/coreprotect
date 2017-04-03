import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class home1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class home1 extends Actor
{
    /**
     * Act - do whatever the home1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        click();
    }    
    public void click(){
        //when click return to start menu
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new start());
        }
    }
}
