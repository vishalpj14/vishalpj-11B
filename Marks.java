// page 538
//#2

import java.util.*; 
public class Marks extends Student {
    int p,c,m,cts,e;
    float per=0,tot=0;
    char gd;
    void readdata(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Marks");
        System.out.print("Physics");
        p=in.nextInt();
        System.out.print("Chemistry");
        c=in.nextInt();
        System.out.print("Mathematics");
        m=in.nextInt();
        System.out.print("Computer Science");
        cts=in.nextInt();
        System.out.print("English");
        e=in.nextInt();
    }
    void compute(){
        
        tot=p+c+m+cts+e;
        per=(tot*100)/500;
        if(per>=90){
            gd='A';
        }else if(per>=60&&per<90){
            gd='B';
        }else if(per>=40 &&per<60){
            gd='C';
        }else if(per<40){
            gd='D';
        }else{
            System.out.println("You are invalid");
        }
    }
    void showdata(){
        printdata();
        System.out.println("Marks");
        System.out.println("Physics :"+p);
        System.out.println("Chemistry :"+c);
        System.out.println("Mathematics :"+m);
        System.out.println("Computer Science :"+cts);
        System.out.println("English :"+e);
    }
}
