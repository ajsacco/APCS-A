// A+ Computer Science  -  www.apluscompsci.com
import javax.swing.JOptionPane;
//this example demonstrates how to to use a
//while loop to sum all of the digits of a number

public class SummingDigits
{
   public static void main(String args[])
   {
       int number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
       int total = 0;
       
       while(number > 0){
           total = total + (number % 10);
           number = number / 10;
       }
       System.out.println(total);
       
        //while number is greater than 0
           //add the right most digit to the total
           //chop off the right most digit of number

        //print out the number
    }
}
