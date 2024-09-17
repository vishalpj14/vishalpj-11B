// page 457 prog 15
// Record #15
import java.util.Scanner;

public class Adder{
    int a[];
    Adder(){
        a=new int[2];
        for(int i=0;i<2;i++){
            a[i]=0;
        }
    }
    void readtime(){
        System.out.println("Enter time in hours and minutes");
        Scanner in=new Scanner(System.in);
        a[0]=in.nextInt();
        a[1]=in.nextInt();
    }
    void addtime(Adder X, Adder Y){
        a[0]=X.a[0]+Y.a[0];
        a[1]=X.a[1]+Y.a[1];
        while(a[1]>=60){   
            a[0]++;
            a[1]-=60;
        }
    }
    void disptime(){
        System.out.println(a[0]+ "hours "+a[1]+" minutes");
    }
    public static void main(String args[]){
        Adder o1=new Adder();
        Adder o2=new Adder();
        Adder o3=new Adder();
        o1.readtime();
        o2.readtime();
        o3.addtime(o1,o2);
        o3.disptime();
    }
}