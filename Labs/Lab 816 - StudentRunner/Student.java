
/**
 * Write a description of class Student here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Student
{
    // instance variables of class Student
    private int studNumber;

    /**
     * Constructor for objects of class Student
     */
    public Student()
    {
        // initialise instance variables
        studNumber = 0;
    }

    /**
     * Student Methods
     */
    public void setStudNumber(int sn){
        studNumber = sn;
    }
    
    public int getStudNumber(){
        return studNumber;
    }
}
