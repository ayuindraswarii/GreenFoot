import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        
        Bug ayu = new Bug();
        addObject(ayu, 50, 300);
        
        Score x = new Score();
        addObject(x, 50, 50);
        
        Life y = new Life();
        addObject(y, 750, 50);
        
        Score.nilai = 0; //mulainya score
        Life.jumlah = 3; //jumlah life pertama kali mulai
    }
}
