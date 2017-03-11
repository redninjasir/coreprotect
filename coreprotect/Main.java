import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main extends Actor
{
    /**
     * Act - do whatever the main wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage image = new GreenfootImage("main.png");
    GreenfootImage image1 = new GreenfootImage("main1.png");
    GreenfootImage image2 = new GreenfootImage("main2.png");
    GreenfootImage image3 = new GreenfootImage("main3.png");
    GreenfootImage image4 = new GreenfootImage("main4.png");
    GreenfootImage image5 = new GreenfootImage("main5.png");
    GreenfootImage image6 = new GreenfootImage("main6.png");
    GreenfootImage image7 = new GreenfootImage("main7.png");
    public static int speed = 5;
    public static int health = 3;
    public void act() 
    {
        move();
    }
    public void move(){
        if(Greenfoot.isKeyDown("up")){
            setImage(image);
            setLocation(getX(), getY() - speed);
        }
        if(Greenfoot.isKeyDown("right")){
            setImage(image2);
            setLocation(getX() + speed, getY());
        }
        if(Greenfoot.isKeyDown("down")){
            setImage(image4);
            setLocation(getX(), getY() + speed);
        }
        if(Greenfoot.isKeyDown("left")){
            setImage(image6);
            setLocation(getX() - speed, getY());
        }
        if(Greenfoot.isKeyDown("up")&&Greenfoot.isKeyDown("right")){
            setImage(image1);
        }
        if(Greenfoot.isKeyDown("right")&&Greenfoot.isKeyDown("down")){
            setImage(image3);
        }
        if(Greenfoot.isKeyDown("down")&&Greenfoot.isKeyDown("left")){
            setImage(image5);
        }
        if(Greenfoot.isKeyDown("left")&&Greenfoot.isKeyDown("up")){
            setImage(image7);
        }
        push(getX(),getY());
    }
    public void push(int x, int y){
        if(Greenfoot.isKeyDown("z")){
            Actor actor = getOneIntersectingObject(Barrier.class);
            if(actor!=null){
                actor.setLocation(actor.getX()+(x-getX()),actor.getY()+(y-getY()));
            }
        }  
        super.setLocation(x,y);
    }
}
