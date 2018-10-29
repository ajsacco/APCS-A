
/**
 * Write a description of class Student here.
 *
 * @author (Aidan Sacco)
 * @version (1025)
 */
public class Student
{
    private String firstName = "";
    private String middleName = "";
    private String lastName = "";
    private int studentNumber = 0;
    private double studentGPA = 0.0;
    
    public Student(String name, int number, double gpa){
        parseName(name);
        studentNumber = number;
        studentGPA = gpa;
    }
    
    public void parseName(String n){
        
    }
    
    public String getFullName(){
        return lastName + ", " + firstName + " " + middleName;
    }
    public int getStudentNumber(){
        return studentNumber;
    }
    public double getGPA(){
        return studentGPA;
    }
    public void setFirstName(String fName){
        firstName = fName;
    }
    public void setMiddleName(String mName){
        middleName = mName;
    }
    public void setLastName(String lName){
        lastName = lName;
    }
    public void setStudentNumber(int sNumber){
        studentNumber = sNumber;
    }
    public void setGPA(double gpa){
        studentGPA = gpa;
    }
}
