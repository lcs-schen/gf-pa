
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is a game about a bear try its best eat red balls.
 * 
 * @author Sam Chen 
 * @version 1.0
 */
public class Space extends World
{
    Timer timer = new Timer();
    Counter counter = new Counter();
    private int time;
    
    /**
     * Constructor for objects of class background.
     * 
     */
    public Space()
    {    
        // Create a new world with 500x500 cells with a cell size of 1x1 pixels.
        super(500, 500, 1); 
        setUp();
        prepare();
        
    }

   
    /**
     * Create balls in the world.
     */
    private void setUp()
    {
        int i = 0;
        while (i<10) {
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(getHeight());
            addObject( new ball(), x, y );
            i++;
            
        }
        
        addObject(counter, 80, 40);
        addObject(timer, 380, 40);
    }

    
    /**
     * Create 3 virus in the world.
     */
    private void prepare() 
    {
         int i = 0;
        while (i<3) {
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(getHeight());
            addObject( new virus(), x, y );
            i++;
            
        }
        
        addObject( new bear(), 250, 400 );
    }
    
    /**
     * Get counter in the world.
     */
    public Counter getCounter()
    {
        return counter;
    }
    
    
}
