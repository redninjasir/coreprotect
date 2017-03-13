import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Field extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public static int timer = 7200;
    public static int timeCount = 180;
    public Field()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600,1);
        addObject(new Core(), getWidth()/2, getHeight()/2);
        addObject(new Main(), 400,300);
        addObject(new restart(), 500,100);
        Main.count = 0;
        timeCount = 180;
        timer = 7200;
        Barrier.score = 0;
    }
    public void act(){
         if(timer>0){
            showText("Time: "+timer/60 , 300,20 );
            timer--;
            if(timer == 0){
                Greenfoot.setWorld(new Scoreboard());
            }
        }
        addEnemy();
        timeCount = 120-(timer/60);
    }
    public void addEnemy(){
        while(getObjects(Enemy.class).size()<=5){
            for(int i = 0;i<5;i++){
                int a = Greenfoot.getRandomNumber(getWidth());
                addObject(new Enemy(), getWidth()-a,0);
           }
            for(int j = 0;j<5;j++){
                int b = Greenfoot.getRandomNumber(getHeight());
                addObject(new Enemy(), 0, getHeight()-b);
           }
            for(int j = 0;j<5;j++){
                int b = Greenfoot.getRandomNumber(getHeight());
                addObject(new Enemy(), 600, getHeight()-b);
           }
            for(int j = 0;j<5;j++){
                int b = Greenfoot.getRandomNumber(getHeight());
                addObject(new Enemy(), getWidth()-b, 600);
           }
        }
    }
}

