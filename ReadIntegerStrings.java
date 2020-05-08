// Java Foundations   Programming Project 10.1

import java.util.Scanner;

public class ReadIntegerStrings
{
   public static void main (String[] args)
   {
      final int MAX = 10;
      
      String input = "";
      int count = 1, num;
      double sum = 0;
      
      Scanner scan = new Scanner (System.in);
      do
      {
         System.out.print("Enter integer: " + count + ": ");
         input = scan.nextLine();
         
         try
         {
            num = Integer.parseInt(input);
            
            sum = sum + num;
       count++;
         }
         catch (NumberFormatException e)
         {
         System.out.println("INVALID INEGER. Please reenter.");
         }
         }
         while (count <= MAX);
         
         System.out.println("Average: " + sum/MAX);
      }
}