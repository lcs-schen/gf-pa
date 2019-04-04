import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class background extends World
{
    
    
    
    /**
     * Constructor for objects of class background.
     * 
     */
    public background()
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
        while (i<7) {
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(getHeight());
            addObject( new ball(), x, y );
            i++;
            
        }
        
      
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
    
}
