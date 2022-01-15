import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Food here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Food extends Actor
{
    /**
     * Act - do whatever the Food wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        getDown();
        hilang();
    }    
    
    public void getDown(){
        setLocation(getX()-3, getY());
    }
    
    public void hilang(){
    if(getX() <= 50){
    Life.jumlah--;
    if(Life.jumlah == 0){
     Finish x = new Finish();
     Greenfoot.setWorld(x);
    }
    getWorld().removeObject(this);
    }
    }
}
