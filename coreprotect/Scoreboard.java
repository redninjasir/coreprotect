import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.*;
/**
 * Write a description of class Scoreboard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scoreboard extends World
{
    private int scoreCount;
    public boolean test;
    public int count;
    public String amount;
    /**
     * Constructor for objects of class Scoreboard.
     * 
     */
    public Scoreboard()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(new restart(), 200, 300);
        addObject(new home1(), 400,300);
        scoreCount = 0;
        amount = JOptionPane.showInputDialog("Please enter your name");
    }
    public void act(){
        showText("You survived for "+Field.timeCount+" seconds", 300, 100);
        showText(amount+" destroy "+Barrier.score+" triangle", 300, 200);
    }
}
