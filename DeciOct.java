import java.util.*;

public class DeciOct{
    int n;
    int oct;
    DeciOct(){
        n=0;
        oct=0;
    }
    void getnum(int nn){
        n=nn;
    }
    void deci_oct(){
        int p=0;
        while(n>0){
            int d=n%8;
            oct=oct+(int)Math.pow(10,p++)*d;
            n=n/8;
        }
    }
    void show(){
        System.out.println("Decimal number:"+n);
        DeciOct ob=new DeciOct();
        //System.out.println("Octal 
    }
}