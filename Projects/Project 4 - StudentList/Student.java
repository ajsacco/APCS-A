
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
        String first = "";
        String middle = "";
        String last = "";
        int c = n.indexOf(",");
        int sOne = n.indexOf(" ");
        int sTwo = n.indexOf(" ", sOne + 1);
        if (c == -1){
            firstName = n.substring(0, sOne);
            middleName = n.substring(sOne, sTwo);
            lastName = n.substring(sTwo);
        }else{
            if(sTwo == -1){
                lastName = n.substring(0, c);
                firstName = n.substring(sOne + 1);
            }else{
                lastName = n.substring(0, c);
                firstName = n.substring(sOne + 1, sTwo);
                middleName = n.substring(sTwo);
            }
        }
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
