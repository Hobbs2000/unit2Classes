

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class DoorTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DoorTest
{
    /** description of instance variable x (add comment for each instance variable) */

    /**
     * Default constructor for objects of class DoorTest
     */
    public DoorTest()
    {
        // initialise instance variables
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testOpen()
    {
        Door door = new Door("Side", false);
        door.open();
        assertEquals(true, door.isOpen());
    }
    
    @Test
    public void testClose()
    {
        Door door = new Door("Side", true);
        door.close();
        assertEquals(false, door.isOpen());
    }
    
    @Test
    public void testSetName()
    {
        Door door = new Door("Side", false);
        door.setName("Front");
        assertEquals("Front", door.getName());
    }
}
