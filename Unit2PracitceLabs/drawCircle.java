import javax.swing.*;

/**
 * Draws a circle
 * 
 * @author Calvin Field 
 * @version 9/21/15
 */
public class drawCircle
{
    public static void main(String[] args)
    {
        JFrame window = new JFrame();
        window.setBounds(30, 30, 300, 300);
        window.getContentPane().add(new CircleCanvas());
        window.setVisible(true);
    }
}
