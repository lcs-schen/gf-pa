import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A bear should try best get all balls.
 * 
 * @author Sam Chen
 * @version 1.0
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
        
        if ( isTouching(ball.class) ) 
        {
            removeTouching(ball.class);
            Space space = (Space)myWorld;
            Counter counter = space.getCounter();
            counter.addScore();
        }
        
        if ( isTouching(virus.class) ) 
        {
            removeTouching(virus.class);
            Space space = (Space)myWorld;
            Counter counter = space.getCounter();
            counter.removeScore();
        }
        
    }    

    /**
     * Use key board control the bear to move.
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
}
