//page 543 program 3
// Record #18
//#2
import java.util.*;

public class Principal extends Teacher {
    void sortdata(){
        for(int i=0;i<q-1;i++){
            for(int j=0;j<(q-1)-i;j++){
                if(name[j].compareTo(name[j+1])>0){
                    String temp=name[j];
                    name[j]=name[j+1];
                    name[j+1]=temp;
                    temp=dob[j];
                    dob[j]=dob[j+1];
                    dob[j+1]=temp;
                    temp=doj[j];
                    doj[j]=doj[j+1];
                    doj[j+1]=temp;
                }
            }
        }
    }
    void display(){
        System.out.println("Names with date of birth and date of joining :");
        for(int i=0;i<q;i++){
            System.out.println(name[i]+"\t\t"+dob[i]+"\t\t"+doj[i]+"\t\t");
        }
    }
    
    void searchdata(){
        String f;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter name of person to search");
        f=in.nextLine();
        for(int i=0;i<q;i++){
            if(f.equals(name[i])){
                System.out.println("Details available");
                System.out.println(name[i]+"\t\t"+dob[i]+"\t\t"+doj[i]+"\t\t");
                System.exit(0);
            }
        }
        System.out.println("Name not present");
    }
}
