import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class core here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Core extends Actor
{
    public Main player;
    /**
     * Act - do whatever the core wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        follow();
        move(7);
    } 
    public void follow(){
        if(player == null){
            if(!getWorld().getObjects(Main.class).isEmpty()){
                player = (Main) getWorld().getObjects(Main.class).get(0);
            }
        }
        if(player != null){
            int xDiff = player.getX() - getX();
            int yDiff = player.getY() - getY();
            double angle = Math.toDegrees(Math.atan2(yDiff, xDiff));
            setRotation((int)Math.round(angle));
        }
    }
}
