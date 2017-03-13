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
          getWorld().removeObject(this);
          Main.count = 0;
      }
    }
    public void touch(){
        if(isTouching(Enemy.class)){
            Actor e = getOneIntersectingObject(Enemy.class);
            getWorld().removeObject(e);
            hp--;
            score++;
        }
    }
}
