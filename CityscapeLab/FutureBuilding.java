import java.awt.*;
import javax.swing.*;
/**
 * Will draw a basic building, like a skyscraper
 * 
 * @author Calvin Field
 * @version 10/2/15
 */

public class FutureBuilding
{
    private int x;
    private int y;
    private boolean isDay;
    /**
     * Constructor for the BasicBuilding class
     * @param   height  Is height of the building
     * @param   width   Is the width of the building
     */
    public FutureBuilding(boolean day, int xCoor, int yCoor)
    {
        this.x = xCoor;
        this.y = yCoor;
        this.isDay = day;
    }
    
    /**
     * 
     */
    public void draw(Graphics2D g2)
    {
        
        //1st Floor Background
        if (this.isDay == true)
        {
            //make Antenna
            g2.setColor(Color.GREEN);
            g2.fillRect(this.x+30, this.y-50, 6, 100);
            g2.setColor(Color.GRAY);
        }
        else
        {
            g2.setColor(Color.GREEN);
            g2.fillRect(this.x+30, this.y-50, 6, 100);
        }
        g2.fillOval(this.x-2, this.y-2, 154, 154);
        //2nd Floor Background
        if (this.isDay == true)
        {
            g2.setColor(Color.GRAY);
        }
        else
        {
            g2.setColor(Color.GREEN);
        }
        g2.fillOval(this.x-2, (this.y+120)-2, 154, 154);
        //3rd Floor Background
        if (this.isDay == true)
        {
            g2.setColor(Color.GRAY);
        }
        else
        {
            g2.setColor(Color.GREEN);
        }
        g2.fillOval(this.x-2, (this.y+240)-2, 154, 154);
        
        
        //1st Floor
                if (this.isDay == true)
        {
            g2.setColor(Color.BLACK);
        }
        else
        {
            g2.setColor(Color.GRAY);
        }
        g2.fillOval(this.x, this.y, 150, 150);
        
        //Windows for first floor
        if (this.isDay == true)
        {
            g2.setColor(Color.GRAY);
        }
        else
        {
            g2.setColor(Color.YELLOW);
        }

        g2.fillRect(this.x+12, this.y+40, 30, 30); 
        g2.fillRect(this.x+60, this.y+40, 30, 30);
        g2.fillRect(this.x+108, this.y+40, 30, 30);
        g2.fillRect(this.x+12, this.y+80, 30, 30); 
        g2.fillRect(this.x+60, this.y+80, 30, 30);
        g2.fillRect(this.x+108, this.y+80, 30, 30);
        
        //2nd Floor
        if (this.isDay == true)
        {
            g2.setColor(Color.BLACK);
        }
        else
        {
            g2.setColor(Color.GRAY);
        }
        g2.fillOval(this.x, this.y+120, 150, 150);
        
        //Windows for 2nd floor
        if (this.isDay == true)
        {
            g2.setColor(Color.GRAY);
        }
        else
        {
            g2.setColor(Color.YELLOW);
        }

        g2.fillRect(this.x+12, (this.y+120)+40, 30, 30); 
        g2.fillRect(this.x+60, (this.y+120)+40, 30, 30);
        g2.fillRect(this.x+108, (this.y+120)+40, 30, 30);
        g2.fillRect(this.x+12, (this.y+120)+80, 30, 30); 
        g2.fillRect(this.x+60, (this.y+120)+80, 30, 30);
        g2.fillRect(this.x+108, (this.y+120)+80, 30, 30);
        
        //3rd Floor
        if (this.isDay == true)
        {
            g2.setColor(Color.BLACK);
        }
        else
        {
            g2.setColor(Color.GRAY);
        }
        g2.fillOval(this.x, this.y+240, 150, 150);
        
         //Windows for 2nd floor
        if (this.isDay == true)
        {
            g2.setColor(Color.GRAY);
        }
        else
        {
            g2.setColor(Color.YELLOW);
        }

        g2.fillRect(this.x+12, (this.y+240)+40, 30, 30); 
        g2.fillRect(this.x+60, (this.y+240)+40, 30, 30);
        g2.fillRect(this.x+108, (this.y+240)+40, 30, 30);
        g2.fillRect(this.x+12, (this.y+240)+80, 30, 30); 
        g2.fillRect(this.x+60, (this.y+240)+80, 30, 30);
        g2.fillRect(this.x+108, (this.y+240)+80, 30, 30);
    }
}