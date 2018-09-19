
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
        Student s3 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();
        
        String[] names = {"Aidan", "Guy", "Dylan", "Edward", "Alex"};
        int[] nums = {796940, 666666, 555555, 444444, 333333, 222222};
        Student[] students = {s1, s2, s3, s4, s5};
        
        for(int i = 0; i < students.length; i++){
            Student s = students[i];
            s.setStuName(names[i]);
            s.setStuNumber(nums[i]);
        }
        for(int i = 0; i < students.length; i++){
            System.out.println(students[i].getStuName() + ", " + students[i].getStuNumber());
        }
    }
}
