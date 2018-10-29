
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
        String menuNumber = menuNumber(scanner, "1. Add a Student\n" +
                                                "2. Delete a Student\n" +
                                                "3. Edit a Student\n" +
                                                "4. Clear Student Database\n" + 
                                                "5. Print Entire Database\n" + 
                                                "6. Print Student Info\n" +
                                                "Please enter a number or type 'q' to quit:");
        while(loop){
            switch(menuNumber){
                case "1": sl.addStudentToList();
                    break;
                case "2": sl.deleteStudentFromList();
                    break;
                case "3": sl.editStudent();
                    break;
                case "4": sl.clearList();
                    break;
                case "5": sl.printStudentList();
                    break;
                case "6": sl.printStudent();
                    break;
                case "q": loop = false;
                    break;
                default:
                    menuNumber = menuNumber(scanner, "Invalid option. Please enter a new number:");
                    break;
            }
        }
    }

    public static String menuNumber(Scanner scanner, String str){
        System.out.println(str);
        return scanner.nextLine();
    }
}
