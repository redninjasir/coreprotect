import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{   
    public Core point;
    /**
     * Act - do whatever the enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        hunt();
        move(1);
        if(!getIntersectingObjects(Enemy.class).isEmpty()) move(-1);
        kill();
    }    
    public void hunt(){
        if(point == null){
            if(!getWorld().getObjects(Core.class).isEmpty()){
                point = (Core) getWorld().getObjects(Core.class).get(0);
            }
        }
        if(point != null){
            int xDiff = point.getX() - getX();
            int yDiff = point.getY() - getY();
            double angle = Math.toDegrees(Math.atan2(yDiff, xDiff));
            setRotation((int)Math.round(angle));
        }
    }
    public void kill(){
        if(!getIntersectingObjects(Core.class).isEmpty()){
            
        }
    }
}
