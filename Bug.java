import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bug here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bug extends Actor
{
    /**
     * Act - do whatever the Bug wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int langkah = 0;
    public void act() 
    {
        // Add your action code here.
        gerak();
        makan();
        if(langkah % 100 == 0){
        tambahObjek();
    }
    langkah++;
    }   
    
    public void gerak() {
        if(Greenfoot.isKeyDown("Down")) {
            setLocation(getX(), getY()+5);
        }
        else if(Greenfoot.isKeyDown("Up")) {
            setLocation(getX(), getY()-5);
        }
    }
    
    public void tambahObjek(){
        int acak = Greenfoot.getRandomNumber(5)+1;
        if(acak == 1){
            Burger a = new Burger();
            getWorld().addObject(a, 800, Greenfoot.getRandomNumber(600));
        }
        else if (acak == 2){
            Pizza b = new Pizza();
            getWorld().addObject(b,800, Greenfoot.getRandomNumber(600));
        }
        else if (acak == 3){
            Roti c = new Roti();
            getWorld().addObject(c,800, Greenfoot.getRandomNumber(600));
        }
        else if (acak == 4){
            Muffin d = new Muffin();
            getWorld().addObject(d,800, Greenfoot.getRandomNumber(600));
        }
         else if (acak == 5){
             Kentang e = new Kentang();
            getWorld().addObject(e,800, Greenfoot.getRandomNumber(600));
        }
    }
    
    public void makan(){
    if(isTouching(Food.class)) {
        Score.nilai++;
        if(Score.nilai == 10){
            Win y = new Win();
     Greenfoot.setWorld(y);
     Greenfoot.stop();
    }
        removeTouching(Food.class);
        
    }
    }
}
