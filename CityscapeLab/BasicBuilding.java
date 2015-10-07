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
    
    /**
     * 
     */
    public BasicBuilding(int floors, int xCoor)
    {
        this.floorNum = floors;
        this.x = xCoor;
    }
    
    public void draw(Graphics2D g2)
    {
        int newY = 420;
        //Make the first floor
        g2.setColor(Color.BLACK);
        g2.fillRect(this.x, newY, 200, 70);
        for (int makeNum = this.floorNum; makeNum > 0; makeNum--)
        {
            newY += 70;
            g2.setColor(Color.BLACK);
            g2.fillRect(this.x, newY, 200, 70);
        }
    }
}
