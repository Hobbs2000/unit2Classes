

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
    public VendingMachine(int canStart)
    {
        this.cans = canStart;
        this.tokens = 0;
    }

    /**
     * Puts the amount of cans specified into the vending machine
     * @param cans  the amount of cans to be put into the vending machine
     */
    public void fillUp(int newCans)
    {
       if (newCans + this.cans < 51)
       {
           this.cans = newCans;
       }
       else
       {
           System.out.println(this.error());
       }
    }
    
    /**
     * Removes a can from the machine while adding a token
     */
    public void buyCan()
    {
        if (this.cans > 0)
        {
            this.cans -= 1;
            this.tokens += 1;
        }
        else
        {
            System.out.println(this.error());
        }
    }
    
    /**
     * Returns the amount of cans in the machine
     * @return cans The amount of cans in the machine
     */
    public int getCanCount()
    {
        return this.cans;
    }
    
    /**
     * Returns the amount of tokens in the machine
     * @return tokens the amount of tokens in the machine
     */
    public int getTokenCount()
    {
        return this.tokens;
    }
    
    private String error()
    {
        String errorMessage = "This will not work, the machine is either empty or the amount of cans you are trying to enter is to much";
        return errorMessage;
    }
    
}
