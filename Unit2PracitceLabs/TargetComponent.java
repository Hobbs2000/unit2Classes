import java.awt.*;
import java.util.*;
import javax.swing.*;
/**
 * Draws a target
 * 
 * @author Calvin Field 
 * @version 9/22/15
 */
public class TargetComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        Random numGen = new Random();
        try 
        {
            
            for (int go = 0;go<5;go++)
            {
                int newX = numGen.nextInt(300);
                int newY = numGen.nextInt(300);
                int newR = numGen.nextInt(250);
                Target target = new Target(newX, newY, newR);
                target.draw(g2);
                Thread.sleep(1);
            }                 //1000 milliseconds is one second.
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        //Graphics2D g2 = (Graphics2D) g;
        //Target target = new Target(80,100, 500);
        //target.draw(g2);
        
        //Target target2 = new Target(150, 80, 50);
        //target2.draw(g2);
        
        //Target target3 = new Target(200, 100, 50);
        //target3.draw(g2);
        
        //Target target4 = new Target(250, 130, 100);
        //target4.draw(g2);
    }
}
