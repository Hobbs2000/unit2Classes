import java.awt.*;
import javax.swing.*;
/**
 * Is the background for a JFrame, contains an animated background object
 * 
 * @author Calvin Field
 * @version 10 October 2015
 */
public class Background
{
    private boolean isDay;
    private int width;
    private int height;
    private int ObjY;
    private int ObjX;
    public static final int OBJ_DY = 3; 
    public static final int OBJ_DX = 2;
    
    /**
     * Constructor for the Background class
     * @param   day Is the background going to be day or night, true for day, false for night
     * @param   screenWidth Must enter the width of the JFrame to fit the screen
     * @param   screenHeight Must enter the height of the JFrame to fit the screen
     */
    
    public Background(boolean day, int screenWidth, int screenHeight, int skyObjY, int skyObjX)
    {
       this.width = screenWidth;
       this.height = screenHeight;
       this.ObjY = skyObjY;
       this.ObjX = skyObjX;
       
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
            this.ObjY = (this.ObjY);
            g2.fillOval(this.ObjX, this.ObjY, 100, 100);
            
        }
        
        if (this.isDay == false)
        {
            g2.setColor(Color.BLACK);
            g2.fillRect(0, 0, this.height, this.width);
            
            //Make the moon
            this.ObjY = (this.ObjY);
            g2.setColor(Color.WHITE);
            g2.fillOval(this.ObjX, this.ObjY, 100, 100);
            g2.setColor(Color.BLACK);
            g2.fillOval(this.ObjX+40, this.ObjY, 80, 80);
            //g2.fillOval(this.width, this.height-this.
        }
    }
    
    /**
     * Returns the current Y coordinate of the background object
     * @return ObjX  Y coordinate of the background object (either the sun or the moon)
     */
    public int getObjY()
    {
        return this.ObjY;
    }
    
    /**
    * Returns the current X coordinate of the background object
    * @return ObjX  X coordinate of the background object (either the sun or the moon)
    */
    public int getObjX()
    {
        return this.ObjX;
    }
}