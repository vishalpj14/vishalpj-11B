// page 515 program 6

import java.util.*;

public class Series{
    int x,n,f,p,sum;
    Series(){
        x=0;
        n=0;
        f=0;
        p=0;
        sum=0;
    }
    Series(int nx,int nn){
        x=nx;
        n=nn;
        f=0;
        p=0;
        sum=0;
    }
    int Fact(int d){
        if(d==1){
            return 1;
        }else{
            return(d*Fact(d-1));
        }
    }
    int power(int a,int b){
        if(b==0){
            return 1;
        }
        return(a*power(a,b-1));
    }
    //using int cause i cant figure this out with "void"
    int sumseries(){
        if(n==1){
            return 1;
        }else{
            --n;
            return (power(x,n+1)/Fact(n+2))+sumseries();
        }
    }
}