//page 538 base class
//#1
import java.util.*;

public class Student {
    String name,dob;
    int r;
    void inputdata(){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter name");
        name=in.nextLine();
        System.out.print("Enter date if birth");
        dob=in.nextLine();
        System.out.print("Enter roll number");
        r=in.nextInt();
    }
    void printdata(){
        System.out.println("Name: "+name);
        System.out.println("Date of Birth :"+dob);
        System.out.println("Roll Number :"+r);
    }
}