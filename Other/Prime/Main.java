
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.math.*;

public class Main
{
    public static void main(String[] args){
        BigInteger index = new BigInteger("0");
        while(true){
            BigInteger num1 = index.multiply(new BigInteger("6")).subtract(new BigInteger("1"));
            BigInteger num2 = index.multiply(new BigInteger("6")).subtract(new BigInteger("1"));
            if(isPrime(num1, new BigInteger("2"))) System.out.println(num1.toString());
            if(isPrime(num2, new BigInteger("2"))) System.out.println(num2.toString());
            index.add(new BigInteger("1"));
        }
    }
    
    public static boolean isPrime(BigInteger n, BigInteger i){
        if (n.compareTo(new BigInteger("2")) == 0 || n.compareTo(new BigInteger("2")) == -1) return (n.equals(new BigInteger("2"))) ? true : false; 
        if (n.mod(i).equals(new BigInteger("0"))) return false; 
        if (i.multiply(i).compareTo(n) == 1) return true;
        // Check for next divisor 
        return isPrime(n, i.add(new BigInteger("1"))); 
    } 
}
