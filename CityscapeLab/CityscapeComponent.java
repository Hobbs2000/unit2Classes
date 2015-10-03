import java.awt.*;
import javax.swing.*;
import java.util.*;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class CityscapeComponent extends JComponent
{
    // define the objects in your Cityscape as instance variables
    private Background bg = new Background(true, 600, 800);
    private Cloud c = new Cloud(300, 100);
    private Cloud c2 = new Cloud (150, 80);
    private Cloud c3 = new Cloud(500, 200);
    
    // define the CityscapeComponent contructor and intiailize all instance variables
    // ...
    
    
    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     *
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        // invoke the draw method on each object in your Cityscape
        bg.draw(g2);
        c.draw(g2);
        c2.draw(g2);
        c3.draw(g2);
        
    }
    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when they are next drawn.
     *
     */
    public void nextFrame()
    {
        // update the objects in the cityscape so they are animated
        // ...
        Random numGen = new Random();
        int newY;
        if (this.c.getX() > 800)
        {
            newY = numGen.nextInt(400);
            c = new Cloud(-50, newY);
        }
        else
        {
            c = new Cloud(this.c.getX() + Cloud.DX, c.getY() );
        }
        
        if (this.c2.getX() > 800)
        {
            newY = numGen.nextInt(200);
            c2 = new Cloud(-50, newY);
        }
        else 
        {
            c2 = new Cloud(this.c2.getX() + Cloud.DX, this.c2.getY());
        }
        
        if (this.c3.getX() > 800)
        {
            newY = numGen.nextInt(300);
            c3 = new Cloud(-50, newY);
        }
        else 
        {
            c3 = new Cloud(this.c3.getX() + Cloud.DX, this.c3.getY());
        }
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        repaint();
    }

}
