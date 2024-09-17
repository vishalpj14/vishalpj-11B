// page 450 qn 18

import java.util.Scanner;

public class CabService{
    String taxino,name;
    int d;
    CabService(){
        name="";
        taxino="";
        d=0;
    }
    void input(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter taxi number, name and the distance travelled by you");
        taxino=in.nextLine();
        name=in.nextLine();
        d=in.nextInt();
    }
    double calculate(){
        double f=0.0;
        if(d<=1){
            f=25.0;
        }
        return f;
    }
}