import java.util.*;
/**
 * Will remove the comma out of a number entered as a String
 */

public class StringParser
{
    private static String finalStr;
    private static String part1;
    private static String part2;
    
    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);
       
       System.out.print("Enter an integer between 1,000 and 999,999(With the commas): ");
       String strNum = input.next();
       
       int numLen = strNum.length();
       int comPlace = numLen - 4;
       part1 = strNum.substring(0,comPlace);
       part2 = strNum.substring(numLen-3);
       
       finalStr = part1+part2;
       System.out.println(finalStr);
       
    }
}