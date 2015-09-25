
import javax.swing.JFrame;
/**
 * Write a description of class TargetViewer here.
 * 
 * @author  Calvin Field 
 * @version 9/22/15
 */
public class TargetViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        
        frame.setSize(450,450);
        frame.setTitle("Target");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        TargetComponent component = new TargetComponent();
        frame.add(component);
        try
        {
            for (;;)
            {
                Thread.sleep(1);
                frame.repaint();
                frame.setVisible(true);
            }
        }
        catch(InterruptedException ex) 
        {
            Thread.currentThread().interrupt();
        }
        
        //frame.setVisible(true);
    }
}
