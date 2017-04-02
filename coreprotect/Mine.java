import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class wave here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mine extends Item
{
    public static int score = 0;
    public Mine(){
        
    }
    public void touch(){
        if(isTouching(Enemy.class)){
            Actor e = getOneIntersectingObject(Enemy.class);
            getWorld().removeObject(e);
            getWorld().removeObject(this);
            Barrier.score++;
            Greenfoot.playSound("Paralyzing_Cask_target1.wav");
        }
    }
    public void act() 
    {
        touch();
    }    
}
