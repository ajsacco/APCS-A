
/**
 * Write a description of class StudentRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StudentRunner
{
    public static void main(){
        Student s1 = new Student();
        Student s2 = new Student();
        
        s1.setStuNumber(798418);
        s1.setStuGPA(2.3);
        s1.setStuActive(true);
        s1.setStuName("Edward");
        
        s2.setStuNumber(796940);
        s2.setStuGPA(4.0);
        s2.setStuActive(true);
        s2.setStuName("Aidan");
        
        System.out.println("Student1:\nNumber: " + s1.getStuNumber() + "\nGPA: " + s1.getStuGPA() + "\nActive: " + s1.getStuActive() + "\nName: " + s1.getStuName());
        System.out.println("\n\nStudent2:\nNumber: " + s2.getStuNumber() + "\nGPA: " + s2.getStuGPA() + "\nActive: " + s2.getStuActive() + "\nName: " + s2.getStuName());
    }
}
