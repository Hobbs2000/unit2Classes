

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
    public Target(int x, int y)
    {
        this.x = x;
        this.y = y;
        this.radius = 100;
    }

    /**
     * Draws the target
     * @param g2    the graphics context
     */
    public void draw(Graphics2D g2)
    {
        g2.fillOval(this.x, this.y, this.radius, this.radius);
        
        int addY = 12;
        int addX = 12;
        //Setup the new coordinates and dimensions for the second circle of the target
        g2.setColor(Color.white);

        int x2 = this.x + addX;
        
        int y2 = this.y + addY;
        
        double preR = this.radius * .25;
        int subR = (int)preR;
        int r2 = this.radius - subR;
        
        System.out.println("2nd circle x:"+x2+", y:"+y2);
        g2.fillOval(x2, y2, r2, r2);
        
        //Third circle
        g2.setColor(Color.black);

        int x3 = x2 + 9;

        int y3 = y2 + 9;
        
        preR = r2 * .25;
        subR = (int)preR;
        int r3 = r2 - subR;
        
        System.out.println("3rd circle x:"+x3+", y:"+y3);
        g2.fillOval(x3, y3, r3, r3);
        
        //Fourth circle
        g2.setColor(Color.white);
        
        int x4 = x3 + 13;
        
        int y4 = y3 + 13;
        
        preR = r3 * .45;
        subR = (int)preR;
        int r4 = r3 - subR;
        
        System.out.println("4th circle x:"+x4+", y:"+y4);
        g2.fillOval(x4, y4, r4, r4);
        
        //Fifth circle
        g2.setColor(Color.black);
        
        int x5 = x4 + 8;
        
        int y5 = y4 + 8;
        
        preR = r4 * .55;
        subR = (int)preR;
        int r5 = r4 - subR;
        
        System.out.println("5th circle x:"+x5+", y:"+y5);
        g2.fillOval(x5, y5, r5, r5);
    }

}
