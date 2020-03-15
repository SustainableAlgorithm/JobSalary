// Written by: Kathleen Kagan
// ACO 101 - Tibbetts
import java.util.Scanner;
import java.lang.*;
public class KaganProject_1B
{
   public static void main(String[] args)
   {
      final String EMPTYSET = " ";
      int count = 0;
      
      int minSalary = Integer.MAX_VALUE;
      int maxSalary = 0;
      String maxJobTitle = "";
      String minJobTitle = "";
      
      
      Scanner scIn = new Scanner(System.in);
                   
      System.out.println("Please enter a Job Title and a $Salary");
      System.out.println("Press enter to end.");
      String sourceString = scIn.nextLine();
            
      while (sourceString.compareTo("") != 0)
         {              
           int pos1 = sourceString.indexOf('$');
           int numberOfCommas = sourceString.replaceAll("[^,]","").length();
           
               if(numberOfCommas > 1) 
               {
                  System.out.println("Invalid input. Comma errors. Please try again."); 
               }
               
               else if(sourceString.indexOf('$') == -1)
               {
                  System.out.println("Invalid input. No dollar sign. Please try again.");
               }
               else
               {                                             
                  String sourceTitle = sourceString.substring(0, pos1);
                  String makeInteger = sourceString.substring(pos1+1, sourceString.length());
                  int sourceSalary = Integer.parseInt(makeInteger.replaceAll(",",""));
                 
                  if (sourceSalary < minSalary)
                  {
                     minSalary = sourceSalary;
                     minJobTitle = sourceTitle;
                  }
                  if (sourceSalary > maxSalary)
                  {
                     maxSalary = sourceSalary;
                     maxJobTitle = sourceTitle;
                  }                                 
               }
               
               sourceString = scIn.nextLine();
            }     
                  System.out.println("Maximum salary is "+maxSalary+" working as "+maxJobTitle);
                  System.out.println("Minimum salary is "+minSalary+" working as "+minJobTitle);
   // end of code
   }
}