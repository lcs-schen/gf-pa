import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class virus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class virus extends Actor
{
    /**
     * Act - do whatever the virus wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(2);
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
