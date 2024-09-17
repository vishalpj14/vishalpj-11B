// page 543 program 3
// Record #18 
//#1
import java.util.*;

public class Teacher {
    int q=5;
    String name[]=new String[q];
    String dob[]=new String[q];
    String doj[]=new String[q];
    void getData(){
        Scanner in=new Scanner(System.in);
        for(int i=0;i<q;i++){
            System.out.println("Enter name in the cell "+(i+1)+":");
            name[i]=in.nextLine();
            System.out.println("Enter date of birth the cell "+(i+1)+":");
            dob[i]=in.nextLine();
            System.out.println("Enter date of joining in the cell "+(i+1)+":");
            doj[i]=in.nextLine();
        }
    }
    
    void show_getdata(){
        System.out.println("Names with date of birth and date of joining :");
        for(int i=0;i<q;i++){
            System.out.println(name[i]+"\t\t"+dob[i]+"\t\t"+doj[i]+"\t\t");
        }
    }
}
