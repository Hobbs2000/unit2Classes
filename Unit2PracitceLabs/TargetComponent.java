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
        Target target = new Target(10,10,100);
        target.draw(g2);
    }
}
