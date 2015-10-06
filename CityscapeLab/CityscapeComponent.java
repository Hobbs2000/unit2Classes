import java.awt.*;
import javax.swing.*;
import java.util.*;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author Calvin Field
 * @version 6 October 2015
 */
public class CityscapeComponent extends JComponent
{
    // define the objects in your Cityscape as instance variables
    private Background bg = new Background(true, 600, 800, 0, 0);
    private boolean setting = false;
    private boolean isDay = true;
    private boolean sunCameUp = false;
    private boolean sunWentDown = false;
    private boolean justChanged = false;
    
    private Cloud c = new Cloud(this.isDay, 300, 100);
    private Cloud c2 = new Cloud (this.isDay, 150, 80);
    private Cloud c3 = new Cloud(this.isDay, 500, 200);
    
    private int futureBuildingNum;
    private FutureBuilding fb1;
    private FutureBuilding fb2;
    private FutureBuilding fb3;
    private FutureBuilding fb4;

    /**
     * 
     * @param   futureNum   Will determine the amount of futuristic buildings in the cityscape
     */
    public CityscapeComponent(int futureNum)
    {
       this.futureBuildingNum = futureNum;
       if (this.futureBuildingNum > 4)
       {
           this.futureBuildingNum = 4;
       }
       Random numGen = new Random();
       for (int go=5;go>0;go--)
       {
           int randX = numGen.nextInt(701-(-30))+(-30);
           int randY = numGen.nextInt(400-200)+200; 

           if(go == 4)
           {
               this.fb4 = new FutureBuilding(this.isDay, randX, randY);
           }
           else if(go == 3)
           {
               this.fb3 = new FutureBuilding(this.isDay, randX, randY);
           }
           else if(go == 2)
           {
               this.fb2 = new FutureBuilding(this.isDay, randX, randY);
           }
           else if(go == 1)
           {
               this.fb1 = new FutureBuilding(this.isDay, randX, randY);
           }
       }
    }
    
    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     *@param    g   The graphics context for the program
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
            fb1.draw(g2);
        }
        else if(this.futureBuildingNum == 2)
        {
            fb1.draw(g2);
            fb2.draw(g2);
        }
        else if(this.futureBuildingNum == 3)
        {
            fb1.draw(g2);
            fb2.draw(g2);
            fb3.draw(g2);
        }
        else 
        {
            fb1.draw(g2);
            fb2.draw(g2);
            fb3.draw(g2);
            fb4.draw(g2);
        }

        
        
        
    }
    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when they are next drawn.
     *
     */
    public void nextFrame()
    {
        // update the objects in the cityscape so they are animated
        
        //Changes the color of the buildings depending on if its day or night  
        for (int go=5;go>0;go--)
        {
            if(go == 4)
            {
                this.fb4 = new FutureBuilding(this.isDay, fb4.getX(), fb4.getY());
            }
            else if(go == 3)
            {
                this.fb3 = new FutureBuilding(this.isDay, fb3.getX(), fb3.getY());
            }
            else if(go == 2)
            {
                this.fb2 = new FutureBuilding(this.isDay, fb2.getX(), fb2.getY());
            }
            else if(go == 1)
            {
                this.fb1 = new FutureBuilding(this.isDay, fb1.getX(), fb1.getY());
            }
        }
        
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
        

        //////////////   Controls the day and night cycles    ////////////////
        if (this.setting == false)
        {   
            if (isDay == true)
            {
                if (this.justChanged == true)
                {
                    bg = new Background(true, 600, 800, 0, 0 );
                    this.justChanged = false;
                }
                
                if(this.bg.getObjY() > 70 && this.justChanged == false)
                {
                    //Sun comes up and goes down
                    double DnewBG_X = this.bg.getObjX() + Background.OBJ_DX;
                    int newBG_Y  =  (int)(.004*(Math.pow(DnewBG_X-300,2))+70);
                    int newBG_X = (int)DnewBG_X;
                    bg = new Background(true, 600, 800, newBG_X, newBG_Y );
                }
                else
                {
                    this.sunCameUp = true;
                    this.setting = true;
                }
            }
            else
            {
                if (justChanged == true)
                {
                    bg =  new Background(false, 600, 800, 0,0);
                    this.justChanged = false;
                }

                if (this.bg.getObjY() > 70 && this.justChanged == false)
                {
                    //Moon comes up and goes down
                    double DnewBG_X = this.bg.getObjX() + Background.OBJ_DX;
                    int newBG_Y  =  (int)(.004*(Math.pow(DnewBG_X-300,2))+70);
                    int newBG_X = (int)DnewBG_X;
                    bg =  new Background(true, 600, 800, newBG_Y, newBG_X);
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
                if (justChanged == true)
                {
                    bg =  new Background(true, 600, 800, 0,0);
                    this.justChanged = false;
                }
                
                if (this.bg.getObjY() < 550 && this.justChanged == false)
                {
                    //Sun goes down
                    double DnewBG_X = this.bg.getObjX() + Background.OBJ_DX;
                    int newBG_Y  =  (int)(.004*(Math.pow(DnewBG_X-300,2))+70);
                    int newBG_X = (int)DnewBG_X;
                    bg =  new Background(true, 600, 800, newBG_Y, newBG_X);
                }
                else
                {
                    this.sunWentDown = true;
                    this.setting = false;
                }
            }
            else
            {
                if (justChanged == true)
                {
                    bg =  new Background(false, 600, 800, 0,0);
                    this.justChanged = false;
                }
                
                if (this.bg.getObjY() < 550 && this.justChanged == false)
                {
                    //Moon goes down
                    double DnewBG_X = this.bg.getObjX() + Background.OBJ_DX;
                    int newBG_Y  =  (int)(.004*(Math.pow(DnewBG_X-300,2))+70);
                    int newBG_X = (int)DnewBG_X;
                    bg = new Background(false, 600, 800, newBG_Y, newBG_X);
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
            this.justChanged = true;
        }
        else if (this.sunCameUp == false && this.sunWentDown == false)
        {
            this.isDay = true;
            this.justChanged = true;
        }
        System.out.println("X:"+this.bg.getObjX()+" Y:"+this.bg.getObjY());
        //////////////////////////////////////////////////////////////////
        
        
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        repaint();
    }

}
