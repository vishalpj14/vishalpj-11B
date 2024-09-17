// page 154 program 4

import java.util.*;

public class MySeries{
    int x,n,p,fac;
    MySeries(){
        x=0;
        n=0;
        p=0;
        fac=0;
    }
    void getnum(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number of terms in series");
        n=in.nextInt();
        System.out.println("Enter x");
        x=in.nextInt();
    }
    int getPower(int g,int h){
        if(h==0){
            return 1;
        }else{
            return(g*getPower(g,h-1));
        }
    }
    int findFact(int y){
        if(y==1){
            return 1;
        }else{
            return(y*findFact(y-1));
        }
    }
    long findSum(){
        if(n==0){
            return 0;
        }
        --n;
        return (long)(((n+1)*(getPower(x,2*(n+1))/findFact((n+1))))+findSum());
    }
    //main class was not requested in queston but this is an eg case
    /*public static void main(String args[]){
        MySeries o=new MySeries();
        o.getnum();
        o.findSum();
    }*/
}