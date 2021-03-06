import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Class ball, if the bear eat a ball, gain 1 point.
 * 
 * @author Sam Chen
 * @version 1.0
 */
public class ball extends Actor
{
    
    /**
     * Act - do whatever the ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(1);
        turnAtEdge();
        randomTurn();
        
    } 
    
    /**
     * When it touch the edge turn another way.
     */
    public void turnAtEdge()
    {
        if ( isAtEdge() ) 
        {
            turn(17);
        }
    }

    /**
     * Randomly decide to turn from the current direction.
     */
    public void randomTurn()
    {
        if (Greenfoot.getRandomNumber(100) > 70) 
        {
            turn(Greenfoot.getRandomNumber(70)-35);
        }
    }
}
