public class MilkJarCalculator
{
    
   public static final double MILK = 5.5; //gallons
   public static final double JARCAPACITY = 0.75; //gallons
   
   public static void main(String[] args)
   {
      int completelyFilledJars = (int)(MILK / JARCAPACITY);
      System.out.println(completelyFilledJars);
   }
}

//(from supplementary labs provided with Java Concepts: Early Objects, 7e by Cay Horstmann)
