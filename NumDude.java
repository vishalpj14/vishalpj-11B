// Record #16

import java.util.*;

public class NumDude{
    int num;
    NumDude(){
        num=0;
    }
    void input(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter no");
        num=in.nextInt();
    }
    int sumDigit(int x){
        if(x==0){
            return 0;
        }else{
            return (x%10 + sumDigit(x/10));
        }
    }
    void isDude(){
        if(num==Math.pow(sumDigit(num),3)){
            System.out.println("Dudency number");
        }else{
            System.out.println("Not a dudency number");
        }
    }
    public static void main(String args[]){
        NumDude o=new NumDude();
        o.input();
        o.isDude();
    }
}