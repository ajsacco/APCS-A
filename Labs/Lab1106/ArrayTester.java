/**
 * Write a description of class ArrayTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayTester
{
    public static void main(){
        int[][] nums = new int[10][10];
        
        loadArray(nums);
        System.out.println("Sum: " + sumAll(nums));
        int g = findGreatest(nums);
        System.out.println("Greatest: " + g);
        System.out.println("Number of greatest: " + numberOfGreatest(nums, g));
        System.out.println("Average: " + findAverage(nums));
    }

    public static void loadArray(int[][] nums){
        for(int r = 0; r < nums.length; r++){
            for(int c = 0; c < nums[r].length; c++){
                nums[r][c] = (int)(Math.random()*100)+1;
            }
        }
    }

    public static int sumAll(int[][] nums){
        int sum = 0;
        for(int r = 0; r < nums.length; r++){
            for(int c = 0; c < nums[r].length; c++){
                sum += nums[r][c];
            }
        }
        return sum;
    }

    public static int findGreatest(int[][] nums){
        int greatest = nums[0][0];
        for(int r = 0; r < nums.length; r++){
            for(int c = 0; c < nums[r].length; c++){
                if(nums[r][c] > greatest){
                    greatest = nums[r][c];
                }
            }
        }
        return greatest;
    }

    public static int numberOfGreatest(int[][] nums, int greatest){
        int numg = 0;
        for(int r = 0; r < nums.length; r++){
            for(int c = 0; c < nums[r].length; c++){
                if(nums[r][c] == greatest) numg += 1;
            }
        }
        return numg;
    }

    public static double findAverage(int[][] nums){
        int sum = 0;
        int num = 0;
        for(int r = 0; r < nums.length; r++){
            for(int c = 0; c < nums[r].length; c++){
                sum += nums[r][c];
            }
            num += nums[r].length;
        }
        return sum/num;
    }
}