//prog 12 page 453
// Record #14
import java.util.Scanner;

public class Mixer{
    int arr[];
    int n;
    Scanner in=new Scanner(System.in);
    Mixer(int nn){
        n=nn;
        arr=new int[n];
    }
    void accept(){ 
        System.out.println("Enter elements in ascending order");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
    }
    Mixer mix(Mixer A){
        Mixer f=new Mixer(n+A.n);
        for(int i=0;i<A.n;i++){
            f.arr[i]=A.arr[i];
        }
        for(int i=0;i<n;i++){
            f.arr[(A.n)+i]=arr[i];
        }
        return f;
    }
    void display(){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        System.out.println("Enter length of first two arrays");
        Scanner in=new Scanner(System.in);
        int m=in.nextInt();
        int n=in.nextInt();
        Mixer o1=new Mixer(m);
        Mixer o2=new Mixer(n);
        Mixer o3=new Mixer(m+n);
        o1.accept();
        o2.accept();
        o3=o2.mix(o1);
        o3.display();
    }
}