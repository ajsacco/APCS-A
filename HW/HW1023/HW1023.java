
/**
 * Write a description of class HW1023 here.
 *
 * @author (Aidan Sacco)
 * @version (1023)
 */
public class HW1023
{
    public static String go(int x){
        if (x==5)
            return "same";
        else if (x>5)
            return "notsame";
        return "done";
    }

    public static void subs(){
        String str = "199 Churchill Ave. Woodside CA, 94062";

        //System.out.println(str.substring("Church")); //error
        //System.out.println(str.substring(" ")); //error
        System.out.println(str.indexOf("Bananas"));
        System.out.println(str.substring(str.indexOf("4")));
        System.out.println(str.substring(str.indexOf("CA")));
        System.out.println(str.substring(str.indexOf("W"), str.indexOf("W")+9));
        System.out.println(str.indexOf(str.substring(2, 4)+1));
        //String str2 = str.substring(indexOf("Woodside")); / error
        //System.out.println(str2.substring(indexOf(" "))); //error

    }

    public static void loop(){
        for(int i = 3; i > 0 ; i--){
            for(int j = 3; j>= i; j--){
                System.out.print(", " + i*j);
            }
            System.out.println();
        }
    }

    public static void countCode(String str) {
        int index = str.indexOf("co") + 3;
        if(index <= 2 || str.length() <= 3){
            System.out.println("0");
            return;
        }
        int occur = 0;
        int nextIndex = 0;
        while(nextIndex < str.length()){
            index = str.indexOf("co", nextIndex) + 3;
            if(index <= 2){
                break;
            }
            else {
                if(str.substring(index, index + 1).equals("e")) {
                    occur++;
                }
                nextIndex = index + 1;
            }
        }
        System.out.println(occur);
    }
}
