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
    private Background bg = new Background(true, 600, 800, 550);
    private boolean setting = false;
    private boolean isDay = true;
    private boolean sunCameUp = false;
    private boolean sunWentDown = false;
    
    private Cloud c = new Cloud(this.isDay, 300, 100);
    private Cloud c2 = new Cloud (this.isDay, 150, 80);
    private Cloud c3 = new Cloud(this.isDay, 500, 200);
    
    private int futureBuildingNum;
    /**
     * 
     */
    public CityscapeComponent(int futureNum)
    {
        this.futureBuildingNum = futureNum;
    }
    
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
        
         if (this.futureBuildingNum == 1)
        {
            FutureBuilding fb1 = new FutureBuilding(this.isDay, 200, 200);
            fb1.draw(g2);
        }
        if(this.futureBuildingNum > 1)
        {
            FutureBuilding fb1 = new FutureBuilding(this.isDay, 200, 200);
            fb1.draw(g2);
            FutureBuilding fb2 = new FutureBuilding(this.isDay, 300, 300);
            fb2.draw(g2);
        }
        if(this.futureBuildingNum > 2)
        {
            FutureBuilding fb1 = new FutureBuilding(this.isDay, 200, 200);
            fb1.draw(g2);
            FutureBuilding fb2 = new FutureBuilding(this.isDay, 300, 300);
            fb2.draw(g2);
            FutureBuilding fb3 = new FutureBuilding(this.isDay, 400, 400);
            fb3.draw(g2);
        }
        
        
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
            c = new Cloud(this.isDay, -50, newY);
        }
        else
        {
            c = new Cloud(this.isDay, this.c.getX() + Cloud.DX, c.getY() );
        }
        
        if (this.c2.getX() > 800)
        {
            newY = numGen.nextInt(200);
            c2 = new Cloud(this.isDay, -50, newY);
        }
        else 
        {
            c2 = new Cloud(this.isDay, this.c2.getX() + Cloud.DX, this.c2.getY());
        }
        
        if (this.c3.getX() > 800)
        {
            newY = numGen.nextInt(300);
            c3 = new Cloud(this.isDay, -50, newY);
        }
        else 
        {
            c3 = new Cloud(this.isDay, this.c3.getX() + Cloud.DX, this.c3.getY());
        }
        
        
        //////////////   Controls the time of day    ////////////////
        if (this.setting == false)
        {
            if (isDay == true)
            {
                if (this.bg.getObjY() > 70)
                {
                    //Sun comes up
                    bg = new Background(true, 600, 800, this.bg.getObjY() - Background.OBJ_DY);
                }
                else 
                {
                    this.sunCameUp = true;
                    this.setting = true;
                }
            }
            else
            {
                if (this.bg.getObjY() > 70)
                {
                    //Moon comes up
                    bg =  new Background(false, 600, 800, this.bg.getObjY() - Background.OBJ_DY);
                }
                else
                {
                    this.sunCameUp = false;
                    this.setting = true;
                }
            }
        }
        else if(this.setting == true)
        {
            if (this.isDay == true)
            {
                if (this.bg.getObjY() < 550)
                {
                    //Sun goes down
                    bg =  new Background(true, 600, 800, this.bg.getObjY() + Background.OBJ_DY);
                }
                else
                {
                    this.sunWentDown = true;
                    this.setting = false;
                }
            }
            else
            {
                if (this.bg.getObjY() < 550)
                {
                    //Moon goes down
                    bg = new Background(false, 600, 800, this.bg.getObjY() + Background.OBJ_DY);
                }
                else
                {
                    this.sunWentDown = false;
                    this.setting = false;
                }
            }
        }
        if (this.sunCameUp == true && this.sunWentDown == true)
        {
            this.isDay = false;
        }
        else if (this.sunCameUp == false && this.sunWentDown == false)
        {
            this.isDay = true;
        }
        //////////////////////////////////////////////////////////////////
        
        
        
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        repaint();
    }

}
