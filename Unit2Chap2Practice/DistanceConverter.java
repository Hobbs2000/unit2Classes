

/**
 * Write a description of class MagicNumbers here.
 * 
 * @author Calvin Field 
 * @version 9/25/15
 */
public class DistanceConverter
{
    static final int FEET_IN_A_YARD = 3;
    static final int INCHES_IN_A_FOOT = 12;
    static double yards = 3.5;
    public static void main(String[] args)
    {
        double feet = yards * FEET_IN_A_YARD;
        double inches = feet * INCHES_IN_A_FOOT;
        
        System.out.println(yards + " yards are " + feet + " feet");
        System.out.println(yards + " yards are " + inches + " inches");
        
    }
}
