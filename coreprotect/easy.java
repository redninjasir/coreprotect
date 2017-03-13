import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class easy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class easy extends Lmenu
{
    /**
     * Act - do whatever the easy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        check();
    }   
    public void check(){
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new Field());
            Enemy.move = 1;
        }
    }
}
