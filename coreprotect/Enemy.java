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
    public static final int amount = 1;
    public static int move;
    public void act() 
    {
        hunt();
        move(move);
        touch();
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
    public void touch(){
        if(isTouching(Core.class)){
            Actor c = getOneIntersectingObject(Core.class);
            Greenfoot.setWorld(new Scoreboard());
        }
    }
}
