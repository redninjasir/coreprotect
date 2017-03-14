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
    public static int speed = 6;
    public static int health = 3;
    public static final int barrierReload = 100;
    public static int barrierDelay;
    public static int count = 0;
    public Main(){
        barrierDelay = 100;
    }
    public Main(int c){
        count = 0;
    }
    public void act() 
    {
        move();
        barrierDelay++;
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
        if(count == 1){
            if(Greenfoot.isKeyDown("z")){
            push();
            }
        }
        if(Greenfoot.isKeyDown("x")){
            if(count == 0){
                if(barrierDelay>=barrierReload){
                    Barrier barrier = new Barrier(3);
                    getWorld().addObject(barrier, this.getX(), this.getY());
                    barrier.setRotation(getRotation());
                    barrierDelay = 0;
                    count++;
                    barrier.hp = 3;
                    Greenfoot.playSound("Tempest_Double.wav");
                }
            }
        }
    }
    public void push(){
        Barrier b = getWorld().getObjects(Barrier.class).get(0);
        b.setLocation(this.getX(), this.getY());
    }
}
