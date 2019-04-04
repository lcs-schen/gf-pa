import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bear here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bear extends Actor
{
    /**
     * Act - do whatever the bear wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        World myWorld = getWorld();
        checkKeyPress();
        touchBall();
        
        touchVirus();
        
    }    

    /**
     * Check whether a keyboard key has been pressed and react if it has.
     */
    private void checkKeyPress()
    {
        if (Greenfoot.isKeyDown("up")) 
        {
            setLocation(getX(), getY()-1);
        }
        
        if (Greenfoot.isKeyDown("down")) 
        {
            setLocation(getX(), getY()+1);
        }
        
        if (Greenfoot.isKeyDown("left")) 
        {
            setLocation(getX()-1, getY());
        }
        
        if (Greenfoot.isKeyDown("right")) 
        {
            setLocation(getX()+1, getY());
        }
    }
    
    /**
     * 
     */
    public void touchBall()
    {
        if ( isTouching(ball.class) ) 
        {
            removeTouching(ball.class);
            
        }
       
        
    }
    
    /**
     * 
     */
    public void touchVirus()
    {
        if ( isTouching(virus.class) ) 
        {
            removeTouching(virus.class);
        }
    }

}
