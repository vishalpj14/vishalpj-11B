// page 513 program 2
// Record #17

import java.util.*;

public class Pronic{
    int num;
    Pronic(){
        num=0;
    }
    void acceptnum(){
        Scanner in=new Scanner(System.in);
        num=in.nextInt();
    }
    
    boolean ispronic(int v){
        if(v*(v+1)==num){
            return true;
        }else if(v<0){
            return false;
        }else{
        return ispronic(--v);
        }
    }
    void check(){
        if(ispronic(num)){
            System.out.println("Number is pronic");
        }else{
            System.out.println("Number is not pronic");
        }
    }
    public static void main(String args[]){
        Pronic o=new Pronic();
        System.out.println("Enter a number");
        o.acceptnum();
        o.check();
    }
}