

/**
 * A Car has a certain fuel efficiency and a certain amount
 * of fuel in the gas tank. The car can be driven a certain distance
 * 
 * @author Calvin Field
 * @version Version #1 9/10/15
 */
public class Car
{
    /** Fuel efficiancy of the car miles per a gallon (mpg)*/
    private double fuelEfficiency;
    
    /** Amount of fuel left in the tank in gallons */
    private double fuelTank;

    /**
     * Constructor for objects of class Car that specifies fuel efficiency
     */
    public Car(double fuelEfficiency)
    {
        // initialise instance variables
        this.fuelEfficiency = fuelEfficiency;
        this.fuelTank = 0;
    }

    /**
     * Simulates driving the car a specified distance and reduces the amount of 
     * fuel in the tank.
     * 
     *
     * @pre      Specified distance cannot result in more consumption than is available
     * @param    distance distance that the car drives in miles
     */
    public void drive(double distance)
    {
        this.fuelTank -= distance / this.fuelEfficiency;
    }
    
    /**
     * Returns the amount of gas in the tank in gallons
     * @return amount of gas in the tank in gallons
     */
    public double getGasInTank()
    {
        return this.fuelTank;
    }
    
    /**
     * Will add the specified amount of gas in gallons to the fuel tank
     *
     * @pre     There cannot be a negative amount of gallons added, must be positive
     * @param   gallons   The amount of gallons of gas that are put in the tank
     * @return  description of the return value
     */
    public void addGas(double gallons)
    {
        this.fuelTank += gallons;
    }


}
