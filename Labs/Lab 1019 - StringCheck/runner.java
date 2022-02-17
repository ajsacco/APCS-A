/**
 * Write a description of class runner here.
 *
 * @author (Aidan Sacco)
 * @version (1019)
 */
import javax.swing.JOptionPane;

public class runner
{
    public static void main(){
        String s1 = JOptionPane.showInputDialog(null, "Enter a character to check for");
        String s2 = JOptionPane.showInputDialog(null, "Enter a string to check");
        System.out.println(strOccurs(s1, s2));
    }
    public static int strOccurs(String s1, String s2){
        int i = 0;
        int returnValue = 0;
        String a = s1.toLowerCase();
        String b = s2.toLowerCase();
        while(i+1 < b.length()){
            int j = b.indexOf(a, i);
            if(j != -1){
                returnValue++;
            }
            i = j + 1;
        }
        return returnValue;
    }
}
