

/**
 * Will hosld and dispense cans of soda
 * 
 * @author Calvin
 * @version 9/15/15
 */
public class VendingMachine
{
    /** Cans is how many cans of drink are in the vending machine */
    private int cans;
    
    /** tokens is how many tokens have been put into the machine */
    private int tokens;

    /**
     * When contstructing the object, automatically sets the can count to 50 and the tokens to 0
     * 
     */
    public VendingMachine()
    {
        this.cans = 50;
        this.tokens = 0;
    }

    /**
     * Puts the amount of cans specified into the vending machine
     * @param cans  the amount of cans to be put into the vending machine
     */
    public void fillUp(int cans)
    {
       this.cans = cans;
    }
    
    /**
     * Removes a can from the machine while adding a token
     */
    public void buyCan()
    {
        this.cans -= 1;
        this.tokens += 1;
    }
    
    /**
     * Shows the amount of cans in the machine
     * @return cans The amount of cans in the machine
     */
    public int getCanCount()
    {
        return this.cans;
    }
    
    /**
     * 
     */
    public void getTokenCount()
    {
        
    }
    
}
