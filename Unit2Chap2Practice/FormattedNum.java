import java.util.*;
/**
 * Will formatte a phone number into a more readable form
 */
public class FormattedNum
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your phone number as one ten digit number: ");
        String tenDigit = input.next();
        
        String aCode = "("+(tenDigit.substring(0,3))+")";
        String lastDigits = (tenDigit.substring(3,6))+"-"+(tenDigit.substring(6));
        
        String finalPhoneNum = aCode+" "+lastDigits;
        System.out.println(finalPhoneNum);
        
        
        
        
    }
}