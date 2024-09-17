import java.util.*;
// Record #10

public class scalarMatrix{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the order of array");
        int o=in.nextInt();
        System.out.println("Enter the array numbers");
        int a[][]=new int[o][o];
        for(int i=0;i<0;i++){
            for(int j=0;j<0;j++){
                a[i][j]=in.nextInt();
            }
        }
        int f=a[0][0];
        int c=0;
        for(int i=0;i<0;i++){
            for(int j=0;j<0;j++){
                if(i==j){
                    if(a[i][j]==f){
                       c++; 
                    }
                }
            }
        }
        if(c==o){
            System.out.println("It is a scalar matrix");
        }else{
            System.out.println("It is not a scalar matrix");
        }
        
    }
}