import java.awt.Graphics;
import javax.swing.JComponent;

/**
 * Puts a circle in the window
 * 
 * @author Calvin Field 
 * @version 9/22/15
 */
class CircleCanvas extends JComponent
{
    public void paint(Graphics g)
    {
        g.drawOval(10,10,200,200);
    }
}
