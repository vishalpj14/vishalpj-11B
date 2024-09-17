import java.util.*;

public class Combination{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a combination");
        int n=in.nextInt();    
        combo(n);
    }
    static void combo(int n){
        int j;
        int sum=0;
        for(int i=1;i<=(n/2+1);i++){
            sum=0;
            for(j=i;j<=(n/2+1);j++){
                sum=sum+j;
                if(sum==n){
                    break;
                }
            }
            if(j<=(n/2+1)){
                for(int k=i;k<=j;k++){
                    System.out.print(k+" ");
                }
                System.out.println();
            }   
        }
    }
    
}