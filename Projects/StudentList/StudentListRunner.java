/**
 * Write a description of class StudentListRunner here.
 *
 * @author (Aidan Sacco)
 * @version (1025)
 */
import java.util.Scanner;

public class StudentListRunner
{
    public static void main(){
        Scanner scanner = new Scanner(System.in);
        StudentList sl = new StudentList();
        boolean loop = true;
        boolean mnSet = false;
        String menuNumber = "";
        while(loop){
            if(mnSet == false){
                menuNumber = menu(scanner);
                mnSet = true;
            }
            switch(menuNumber){
                case "1":
                    clearScreen();
                    System.out.print("Enter a name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter a student number: ");
                    int number = scanner.nextInt();
                    System.out.print("Enter a GPA: ");
                    double gpa = scanner.nextDouble();
                    sl.addStudentToList(name, number, gpa);
                    menuNumber = menu(scanner);
                    clearScreen();
                    break;
                case "2":
                    clearScreen();
                    System.out.println("Enter a name or number");
                    String in2 = scanner.nextLine();
                    sl.deleteStudentFromList(in2);
                    break;
                case "3":
                    clearScreen();
                    System.out.println("Enter a name or number");
                    String in3 = scanner.nextLine();
                    sl.editStudent(in3, scanner);
                    break;
                case "4":
                    clearScreen();
                    sl.clearList();
                    break;
                case "5":
                    clearScreen();
                    sl.printStudentList();
                    break;
                case "6":
                    clearScreen();
                    System.out.println("Enter a name or number");
                    String in6 = scanner.nextLine();
                    sl.printStudent(in6);
                    break;
                case "q":
                    loop = false;
                    break;
                default:
                    mnSet = true;
                    menuNumber = menuNumber(scanner, "Invalid option. Please enter a new number:");
                    break;
            }
        }
    }

    public static String menu(Scanner scanner){
        return menuNumber(scanner, "1. Add a Student\n" +
            "2. Delete a Student\n" +
            "3. Edit a Student\n" +
            "4. Clear Student Database\n" + 
            "5. Print Entire Database\n" + 
            "6. Print Student Info\n" +
            "Please enter a number or type 'q' to quit:");
    }

    public static String menuNumber(Scanner scanner, String str){
        System.out.println(str);
        return scanner.nextLine();
    }

    public static void clearScreen(){
        System.out.println("\u000c");
        System.out.flush();
    }

    public static boolean isInt(String input){
        try {
            Integer.parseInt(input); 
            return true;
        }  
        catch (NumberFormatException e){ 
            return false;
        } 
    }
}
