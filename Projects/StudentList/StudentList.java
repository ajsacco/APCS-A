
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
    public void deleteStudentFromList(){
        
    }
    public void editStudent(){
        
    }
    public void clearList(){
        studentList.clear();
    }
    public void printStudentList(){
        for(int i = 0; i < studentList.size(); i++){
            Student stu = studentList.get(i);
            System.out.println("[Name: " + stu.getFullName() + 
                            " - Student Number: " + stu.getStudentNumber() + 
                            " - GPA: " + stu.getGPA() + "]\n");
        }
    }
    public void printStudent(){
    }
}
