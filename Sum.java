// sum recursion 
import java.util.*;

public class Sum{
    static int sum(int n){
        if(n==0){
            return 0;
        }else{
            return (n+sum(n-1));
        }
    }
    
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter value>0");
        System.out.println(sum(in.nextInt()));
        
    }
}