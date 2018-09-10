
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
        nums = new int[10];
    }
    
    //  Methods
    public void loadArray(){
        for(int i = 0; i<nums.length; i++){
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
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        return sum;
    }
    public double getMean(){
        int s = getSum();
        return (s/nums.length);
    }
    public double getMedian(){
        
        return 2.0;
    }
    public int[] getMode(){
        int[] mode = new int[10];
        for(int i = 0; i < nums.length; i++){
            int c = nums[i] - 1;
            mode[c] += 1;
        }
        int[] tmode = new int[11];
        int f = 0;
        for(int e = 0; e < mode.length; e++){
            if(mode[e]!=0){
                if(mode[e] == tmode[e]){
                    f++;
                    tmode[f] = mode[e];
                }else if(mode[e] > tmode[e]){
                    tmode[f] = mode[e];
                }
            }
        }
        return tmode;
    }
}
