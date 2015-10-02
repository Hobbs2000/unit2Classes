import java.awt.*;
import javax.swing.*;
/**
 * Will draw a cloud
 * 
 * @author Calvin Field
 * @version 10/2/15
 */
public class Cloud
{
    public int x;
    public int y;
    
    /**
     * Constructor for class Cloud
     * @param   size    Will set the size of that cloud instance
     */
    public Cloud(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    /**
     * Will draw the cloud
     * @param   g2  The graphics context
     */
    public void draw(Graphics2D g2)
    {
        g2.setColor(Color.white);
        
        g2.fillRect(this.x, this.y, 100, 80);
        
        int rightX = this.x+60;
        int rightY = this.y;
        g2.fillOval(rightX, rightY, 80, 80);
        
        int leftX = this.x-40;
        int leftY = this.y;
        g2.fillOval(leftX, leftY, 80, 80);
        
        int topX = this.x+10;
        int topY = this.y-40;
        g2.fillOval(topX, topY, 80, 80);
    }
}