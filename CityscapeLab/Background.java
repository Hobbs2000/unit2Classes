import java.awt.*;
import javax.swing.*;
/**
 * Is the background for a JFrame
 * 
 * @author Calvin Field
 * @version 10/2/15
 */
public class Background
{
    private boolean isDay;
    private int width;
    private int height;
    
    /**
     * Constructor for the Background class
     * @param   day Is the background going to be day or night, true for day, false for night
     * @param   screenWidth Must enter the width of the JFrame to fit the screen
     * @param   screenHeight Must enter the height of the JFrame to fit the screen
     */
    public Background(boolean day, int screenWidth, int screenHeight)
    {
       this.width = screenWidth;
       this.height = screenHeight;
        
       if (day == true)
       {
           this.isDay = day;
       }
       else
       {
           this.isDay = day;
       }
    }  
    
    /**
     * Will draw the Background
     * @param   g2  The graphics context
     */
    public void draw(Graphics2D g2)
    {
        if (this.isDay == true)
        {
            g2.setColor(Color.BLUE);
            g2.fillRect(this.height, this.width, 0,0);
        }
    }
}