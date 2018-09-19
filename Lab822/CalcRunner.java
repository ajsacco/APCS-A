
/**
 * Write a description of class CalcRunner here.
 *
 * @author (Aidan Sacco)
 * @version (a version number or a date)
 */
public class CalcRunner extends SimpleCalc
{
    public static void main(){
        SimpleCalc s1 = new SimpleCalc();
        
        System.out.println(s1.add(12,7));
        System.out.println(s1.subtract(12,7));
        System.out.println(s1.multiply(12,7));
        double e = s1.divide(12,0);
        if(e == Double.MAX_VALUE){
            System.out.println("UNDEFINED");
        }else{
            System.out.println(e);
        }
        System.out.println(s1.moduloDivide(12,7));
    }
    
}
