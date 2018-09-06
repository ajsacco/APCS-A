
/**
 * StatTester finds loads an Array of int
 * and finds the sum, mean, median, and mode.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

// imports go here
import java.util.Arrays;
public class StatTester{
    //  Instance variables
    private int[] nums;
    
    // Constructor
    public StatTester(){
        nums = new int[100];
    }
    
    
    //  Methods
    public void loadArray(){
        for(int i = 0; i<100; i++){
            nums[i] = (int)(Math.random()*10 + 1);
        }
    }
    public void printArray(){
        for(int a = 0; a<10; a++){
            for(int b = 0; b<10; b++){
                System.out.print((10*a)+b );
            }
            System.out.println();
        }
    }
    public int getSum(){
    
        return null;
    }
    public double getMean(){
        
        return null;
    }
    public double getMedian(){
        
        return null;
    }
    public int[] getMode(){
        
        return null;
    }
}
