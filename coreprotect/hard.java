import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hard extends Lmenu
{
    /**
     * Act - do whatever the hard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        check();
    }    
    public void check(){
        //when click set enemy move speed and move to field world
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new Field());
            Enemy.move = 4;
        }
    }
}
