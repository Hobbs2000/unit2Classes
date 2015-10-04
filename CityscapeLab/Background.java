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
    private int ObjY;
    public static final int OBJ_DY = 3; 
    
    /**
     * Constructor for the Background class
     * @param   day Is the background going to be day or night, true for day, false for night
     * @param   screenWidth Must enter the width of the JFrame to fit the screen
     * @param   screenHeight Must enter the height of the JFrame to fit the screen
     */
    
    public Background(boolean day, int screenWidth, int screenHeight, int skyObjY)
    {
       this.width = screenWidth;
       this.height = screenHeight;
       this.ObjY = skyObjY;
       
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
            //System.out.println(this.ObjY);
            g2.setColor(Color.BLUE);
            g2.fillRect(0, 0, this.height,this.width);
            
            //Make the sun
            g2.setColor(Color.YELLOW);
            g2.fillOval(this.width, this.ObjY, 100, 100);
            
        }
        
        if (this.isDay == false)
        {
            g2.setColor(Color.BLACK);
            g2.fillRect(0, 0, this.height, this.width);
            
            //Make the moon
            g2.setColor(Color.WHITE);
            g2.fillOval(this.width, this.ObjY, 100, 100);
            g2.setColor(Color.BLACK);
            g2.fillOval(this.width+40, this.ObjY, 80, 80);
            //g2.fillOval(this.width, this.height-this.
        }
    }
    
    /**
     * 
     */
    public boolean getIsDay()
    {
        return this.isDay;
    }
    
    /**
     * 
     */
    public int getObjY()
    {
        return this.ObjY;
    }
   
}