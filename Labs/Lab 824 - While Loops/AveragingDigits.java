// A+ Computer Science  -  www.apluscompsci.com

import java.util.*;

//this example demonstrates how to to use a
//while loop to average all of the digits of a number

public class AveragingDigits
{
    //pre - num > 0
    //post - number of digits in num will be returned
    public static int countDigits( int num )
    {
       int total = 0;
       int i = 0;
       while(num > 0){
           total = total + (num % 10);
           num = num / 10;
           i++;
       }
        
        return i;
    }

    //pre - num > 0
    //post - sum of digits in num will be returned
    public static double sumDigits( int num )
    {
       int total = 0;
       
       while(num > 0){
           total = total + (num % 10);
           num = num / 10;
       }
        
        return total;
    }

    //pre - none
    //post - average of digits in num will be returned
    //         unless num <= 0 then 0 is returned
    public static double averageDigits( int num )
    {
        int c = countDigits(num);
        double sum = sumDigits(num);
        return sum / c;
    }

   public static void main(String args[])
   {
        Scanner kb = new Scanner( System.in );
        System.out.print( "Enter a number > 0 :: " );
        int num = kb.nextInt();
        System.out.println("The digit average is " + averageDigits( num) );
   }
}
