

/**
 * A target shape that can be positioned on the screen
 * 
 * @author Calvin Field) 
 * @version 9/21/15
 */

import java.awt.*;
import javax.swing.*;

public class Target
{
    private int radius;
    private int x;
    private int y;

    /**
     * Contstructs a target with the x and y being the top left coordinates
     * @param x the x-coordinate of the target
     * @param y the y-coordinate of the target
     * @param r the radius of the target
     */
    public Target(int x, int y, int r)
    {
        this.x = x;
        this.y = y;
        this.radius = r;
    }

    /**
     * Draws the target
     * @param g2    the graphics context
     */
    public void draw(Graphics2D g2)
    {
        g2.fillOval(this.x, this.y, this.radius, this.radius);
        
        //Setup the new coordinates and dimensions for the second circle of the target
        g2.setColor(Color.white);
        double preX = this.x * .75;
        int addX = (int)preX;
        int newX = this.x + addX;
        
        double preY = this.y * .75;
        int addY = (int)preY;
        int newY = this.y + addY;
        
        double preR = this.radius * .15;
        int subR = (int)preR;
        int newR = this.radius - subR;
        
        g2.fillOval(newX, newY, newR, newR);
    }

}
