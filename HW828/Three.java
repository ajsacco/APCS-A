
/**
 * Write a description of class Three here.
 *
 * @author (Aidan Sacco)
 * @version (828)
 */
public class Three
{
    public static void main(){
        for(int i = 0; i<=99; i++){
            System.out.print("i:" + i + " ");
            if(i%2 == 1){
                System.out.print("Odd");
            }else{
                System.out.print("Even");
            }
            System.out.println();
        }
    }
}
