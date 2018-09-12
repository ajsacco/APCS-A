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
        for(int i = 0; i<nums.length; i++){
            nums[i] = (int)(Math.random()*10 + 1);
        }
    }

    public void printArray(){
        for(int a = 0; a<10; a++){
            for(int b = 0; b<10; b++){
                if(b == 9 && a == 9) System.out.print(nums[(10*a)+b]);
                else System.out.print(nums[(10*a)+b] + ", ");
            }
            System.out.println();
        }
    }

    public void printArrayGiven(int[] amode){
        for(int a = 0; a<amode.length; a++){
            if(a == amode.length - 1) System.out.print(amode[a]);
            else System.out.print(amode[a] + ", ");
        }
        System.out.println();
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
        int[] median = new int[nums.length];
        median = nums;
        Arrays.sort(median);
        if(median.length %2 == 0){
            int a = median[median.length/2-1];
            int b = median[median.length/2];
            int c = (a+b)/2;
            return c;
        }else{
            return median[median.length/2];
        }
    }

    public int[] getMode(){
        int[] mode = new int[10];
        for(int i = 0; i < nums.length; i++){
            int c = nums[i] - 1;
            mode[c] += 1;
        }
        int[] tmode = new int[mode.length];
        tmode = mode;
        Arrays.sort(tmode);
        int value = tmode[tmode.length - 1];
        int count = 1;
        for(int e = tmode.length - 2; e >= 0; e--){
            if(tmode[e] == value){
                count++;
            }
        }
        int[] amode = new int[count];
        int ic = count;
        for(int e = 0; e < mode.length; e++){
            if(ic > 0){
                if(mode[e] == value){
                    amode[count-ic] = e;
                    ic--;
                }
            }
        }
        return amode;
    }
}
