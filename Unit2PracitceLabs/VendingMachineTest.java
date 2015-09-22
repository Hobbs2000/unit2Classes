

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class VendingMachineTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VendingMachineTest
{
    /** description of instance variable x (add comment for each instance variable) */

    /**
     * Default constructor for objects of class VendingMachineTest
     */
    public VendingMachineTest()
    {
        
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
    public void fillUpTest()
    {
        VendingMachine machine = new VendingMachine(0);
        machine.fillUp(50);
        assertEquals(50, machine.getCanCount());
    }
    
    @Test
    public void buyCanTest()
    {
        VendingMachine machine = new VendingMachine();
        machine.buyCan();
        assertEquals(1, machine.getTokenCount());
        assertEquals(49, machine.getCanCount());
    }

}
