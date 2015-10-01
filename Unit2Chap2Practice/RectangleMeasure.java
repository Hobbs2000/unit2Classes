import java.util.*;

public class RectangleMeasure
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        //Get input
        System.out.println("What is the length of the rectangle?:");
        double len = input.nextDouble();
        
        System.out.println("What is the height of the rectangle?:");
        double height = input.nextDouble();
        
        //Calculations
        double area = len*height;
        double peri = (len*2)+(height*2);
        double diagLen = Math.sqrt((Math.pow(len, 2))+(Math.pow(height, 2)));
        diagLen = Math.round(diagLen*100)/100;
        //diagLen = Math.round(diagLen*100)/100;
        
        //Display
        System.out.println("Area of your rectangle: "+area);
        System.out.println("Perimeter of your rectangle: "+peri);
        System.out.println("Length of the diagonal of yout rectangle: "+diagLen);
        
    }
}