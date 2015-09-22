

/**
 * Will represent a door and do everythin a door does
 * 
 * @author Calvin Field 
 * @version 9/15/15
 */
public class Door
{
    /** description of instance variable x (add comment for each instance variable) */
    private boolean open;
    private String name;

    /**
     * Constructor for objects of class Door 
     * @param name  name is the name of the door set by the user
     * @param open  is the door open or closed, true for open, false for closed
     */
    public Door(String name, boolean open)
    {
        // initialise instance variables
        this.name = name;
        this.open = open;
    }
    
    /**
     * Default constructor for class Door, no parameters
     */
    public Door()
    {
        this.name = "Door";
        this.open = false;
    }

    
    /**
     * This will close the door by setting the open variable to false
     * @pre When closing, door has to be open prior
     */
    public void close()
    {
        open = false;
    }
    
    /**
     * This will open the door by setting the open variable to true
     * @pre When opening, door has to be closed prior
     */
    public void open()
    {
        open = true;
    }
    
    /**
     * Will return the name of the door as a string
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Returns state of the door, if false, then closed, if true, then open
     */
    public boolean isOpen()
    {
        return open;
    }
    
    /**
     * Sets the name of the door to the new name entered by the user
     */
    public void setName(String newName)
    {
       this.name = newName; 
    }
    
    

}
