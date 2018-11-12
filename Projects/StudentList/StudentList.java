
/**
 * Write a description of class StudentList here.
 *
 * @author (Aidan Sacco)
 * @version (1025)
 */
import java.util.*;

public class StudentList
{
    ArrayList<Student> studentList;
    public StudentList(){
        studentList = new ArrayList<Student>();
    }

    public void addStudentToList(String name, int number, double gpa){
        Student n = new Student(name, number, gpa);
        studentList.add(n);
    }

    public void deleteStudentFromList(String id){
        int e = 0;
        StudentList sl = new StudentList();
        if(sl.isInt(id)){
            e = numIndex(id);
        } else {
            e = nameIndex(id);
        }
        
        studentList.remove(e);
    }

    public void editStudent(String id, Scanner sc){
        int e = 0;
        StudentList sl = new StudentList();
        if(sl.isInt(id)){
            e = numIndex(id);
        } else {
            e = nameIndex(id);
        }
        
        System.out.println("1. FirstName\n2. Middle Name\n3. Last Name\n4. Student Number\n5. GPA\nWhat do you want to edit? ");
        String o = sc.nextLine();
        switch(o){
            case "1":
            System.out.println("Enter a new name: ");
            studentList.get(e).setFirstName(sc.nextLine());
            break;
            case "2":
            System.out.println("Enter a new name: ");
            studentList.get(e).setFirstName(sc.nextLine());
            break;
            case "3":
            System.out.println("Enter a new name: ");
            studentList.get(e).setFirstName(sc.nextLine());
            break;
            case "4":
            System.out.println("Enter a new student number: ");
            studentList.get(e).setGPA(Integer.parseInt(sc.nextLine()));
            break;
            case "5":
            System.out.println("Enter a new GPA: ");
            studentList.get(e).setGPA(Double.parseDouble(sc.nextLine()));
            break;
            default:
            break;
        }
    }

    public void clearList(){
        studentList.clear();
    }

    public void printStudentList(){
        for(int i = 0; i < studentList.size(); i++){
            Student stu = studentList.get(i);
            System.out.println("[Name: " + stu.getFullName() + 
                " - Student Number: " + stu.getStudentNumber() + 
                " - GPA: " + stu.getGPA() + "]");
        }
    }

    public void printStudent(String id){
        int e = 0;
        StudentList sl = new StudentList();
        if(sl.isInt(id)){
            e = numIndex(id);
        } else {
            e = nameIndex(id);
        }

        Student stu = studentList.get(e);
        System.out.println("[Name: " + stu.getFullName() + 
            " - Student Number: " + stu.getStudentNumber() + 
            " - GPA: " + stu.getGPA() + "]");
    }

    public int numIndex(String num){
        int e = 0;
        for(int i = 0; i < studentList.size(); i++){
            if(studentList.get(i).getStudentNumber() == Integer.parseInt(num)) e = i;
        }
        return e;
    }

    public int nameIndex(String name){
        int e = 0;
        for(int i = 0; i < studentList.size(); i++){
            if(studentList.get(i).getFullName().equals(name)) e = i;
        }
        return e;
    }  

    public boolean isInt(String input){
        try {
            Integer.parseInt(input); 
            return true;
        }  
        catch (NumberFormatException e){ 
            return false;
        } 
    }
}
