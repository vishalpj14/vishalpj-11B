// Practical demo qn
// Record #1

import java.util.Scanner;

public class CircularPrime {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a positive number");
        int num=in.nextInt();
        int n=num;
        boolean status=true;
        do{
            System.out.println(n);
            if(!prime(n)){
                status=false;
            }
            String s=String.valueOf(n);
            n=Integer.parseInt(s.substring(1)+s.charAt(0));
        }while(n!=num);
        if(status){
            System.out.println("It is a circular prime");
        }else{
            System.out.println("It is not a circular prime");
        }
    }
    public static boolean prime(int n){
        int f=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                f++;
            }
        }
        return(f==2);
    }
   
}
