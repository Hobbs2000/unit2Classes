
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
        
        frame.setSize(300,300);
        frame.setTitle("Target");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        TargetComponent component = new TargetComponent();
        frame.add(component);
        
        frame.setVisible(true);
    }
}
