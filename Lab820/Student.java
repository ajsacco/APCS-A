
/**
 * Write a description of class Student here.
 * 
 * @author (Aidan Sacco) 
 * @version (820)
 */
public class Student
{
    // instance variables of class Student
    private int stuNumber;
    private boolean stuActive;
    private double stuGPA;
    private String stuName;

    /**
     * Constructor for objects of class Student
     */
    public Student()
    {
        // initialise instance variables
        stuNumber = 0;
        stuActive = true;
        stuGPA = 0.0;
        stuName = " ";
    }

    /**
     * Student Methods
     */
    //setters
    public void setStuNumber(int sn){
        stuNumber = sn;
    }
    
    public void setStuActive(boolean sa){
        stuActive = sa;
    }
    
    public void setStuGPA(double sgpa){
        stuGPA = sgpa;
    }
    
    public void setStuName(String sna){
        stuName = sna;
    }
    //getters
    public int getStuNumber(){
        return stuNumber;
    }
    
    public boolean getStuActive(){
        return stuActive;
    }
    
    public double getStuGPA(){
        return stuGPA;
    }
    
    public String getStuName(){
        return stuName;
    }
}
