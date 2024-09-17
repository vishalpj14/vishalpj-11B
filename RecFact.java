//page514 program 3

import java.util.*;

public class RecFact{
    int n,r;
    RecFact(){
        n=0;
        r=0;
    }
    void readnum(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter values of n and r");
        n=in.nextInt();
        r=in.nextInt();
    }
    int factorial(int f){
        if(f==1){
            return 1;
        }else{
            return f*factorial(f-1);
        }
    }
    void factseries(){
        System.out.println("S: "+factorial(n)/((factorial(r)*factorial(n-r))));
    }
    public static void main(String args[]){
        RecFact o=new RecFact();
        o.readnum();
        o.factseries();
    }
}