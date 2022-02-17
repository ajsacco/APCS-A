/**
 * Write a description of class Main here.
 *
 * @author (Aidan)
 * @version (1204)
 */
import java.math.BigInteger;

public class Main
{
    public static BigInteger zero = new BigInteger("0");
    public static BigInteger one = new BigInteger("1");
    public static BigInteger two = new BigInteger("2");
    public static BigInteger three = new BigInteger("3");
    public static BigInteger six = new BigInteger("6");
    
    public static void main(String[] args){
        BigInteger index = new BigInteger("3");
        while(true){
            BigInteger num = bPow(two, index);
            num = num.subtract(one);
            System.out.println(num.toString());
            if(isPrime(num, three)){
                System.out.println("====================" + num.toString());
            }
            index = index.add(one);
        }
    }
    
    public static BigInteger bPow(BigInteger base, BigInteger pow){
        BigInteger product = base;
        for(BigInteger i = pow; i.compareTo(zero) == 1; i.subtract(one)){
            product = product.multiply(base);
            //System.out.println(product.toString());
        }
        return product;
    }
    
    public static boolean isPrime(BigInteger n, BigInteger i){
        if (n.compareTo(two) == -1){
            return false;
        }
        if (n.compareTo(two) == 0){
            return true;
        }
        if (n.mod(i).equals(zero)){
            return false;
        }
        if (i.multiply(i).compareTo(n) == 1){
            return true;
        }
        // Check for next divisor 
        return isPrime(n, i.add(two)); 
    } 
}
