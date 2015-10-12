import java.awt.*;
import javax.swing.*;
/**
 * Write a description of class BasicBuilding here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BasicBuilding
{
    private int floorNum;
    private int x;
    private boolean isDay;
    
    /**
     * 
     */
    public BasicBuilding(boolean day, int floors, int xCoor)
    {
        this.floorNum = floors;
        this.x = xCoor;
        //System.out.println(day);
        this.isDay = day;
    }
    
    /**
     * 
     */
    public void draw(Graphics2D g2)
    {
        
        //Make the rest of the floors
        int newY = 565;
        //Make the backgrounds for all the floors
        for (int makeNum = this.floorNum; makeNum > 0; makeNum--)
        {
            //Changes color pallete depending on time of day
            if (this.isDay == true)
            {
                g2.setColor(Color.GRAY);
            }
            else
            {
                g2.setColor(Color.GREEN);
            }
                
            newY -= 70;
            g2.fillRect(this.x-2, newY-2, 204, 74);
        }
            
        //Make the actual floors with windows
        newY = 565;
        for (int makeNum = this.floorNum; makeNum > 0; makeNum--)
        {
            g2.setColor(Color.BLACK);
            newY -= 70;
            g2.fillRect(this.x, newY, 200, 70);
                
            //Make windows for current floor
            //System.out.println(this.isDay);
            if (this.isDay == true)
            {
                g2.setColor(Color.GRAY);
            }
            else
            {
                g2.setColor(Color.YELLOW);
            }    
            int windowY = newY + 45;
            int windowX = this.x - 20;
            for (int go=5; go>0; go--)
            {
                windowX += 35;
                g2.fillRect(windowX, windowY, 30, 40);
            }
        }
    }   
}
