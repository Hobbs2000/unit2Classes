

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class AnnuityTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AnnuityTest
{

    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }
    
    
    @Test
    public void testGetPresentValue()
    {
        Annuity annuity = new Annuity(10000.0,.08,20);
        double currentValue = annuity.getPresentValue();
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

}
