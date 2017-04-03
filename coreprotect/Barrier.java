import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class barrier here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Barrier extends Actor
{
    public static int hp;
    public static int score = 0;
    /**
     * Act - do whatever the barrier wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Barrier(int hp){
        hp = 3;
    }
    public void act() 
    { 
      touch();
      if(hp<=0){
          Main.count = 0;
          Greenfoot.playSound("Land_Mines_explode1.wav");
          getWorld().removeObject(this);
      }
    }
    public void touch(){
        //if touch the enemy remove an enemy class then reduce barrier health and increase score
        if(isTouching(Enemy.class)){
           Actor e = getOneIntersectingObject(Enemy.class);
           Item item = new Item();
           if(Greenfoot.getRandomNumber(10) == 3){
               getWorld().addObject(item, e.getX(), e.getY());
           }
           getWorld().removeObject(e);
           hp--;
           score++;
           Greenfoot.playSound("Paralyzing_Cask_target1.wav");
        }
    }
}
