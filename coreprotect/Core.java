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
    public void act() 
    {
        follow();
        move(6);
    } 
    public void follow(){
        //if player is still exist turn to player if not find the player
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
