import javax.swing.*;
import java.awt.*;

public class Cloud
{
    private int x;
    private int y;
    
    public static final int DX = 5;
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
     * 
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
    
    /**
     * 
     */
    public int getX()
    {
        return this.x;
    }
    
    /**
     * 
     */
    public int getY()
    {
        return this.y;
    }
}