import java.awt.*;
import javax.swing.JComponent;
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
        Target target = new Target(80,150, 230);
        target.draw(g2);
        
        Target target2 = new Target(150, 80, 50);
        target2.draw(g2);
        
        Target target3 = new Target(200, 100, 50);
        target3.draw(g2);
        
        Target target4 = new Target(250, 130, 100);
        target4.draw(g2);
    }
}
