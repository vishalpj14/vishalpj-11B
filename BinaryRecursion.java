import java.util.*;

public class BinaryRecursion{
    int mid;
    int bsearch(int x[],int l,int h,int ele,int f){
        mid=l+h/2;
        if(l>h||f==1){
            return f;
        }else{
            if(ele==x[mid]){
                f=1;
            }if(ele<x[mid]){
                h=mid-1;
            }if(ele>x[mid]){
                l=mid+1;
            }
            return(bsearch(x,l,h,ele,f));
        }
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int k,l=0,h=0,f=0,res;
        int arr[]=new int[10];
        h=arr.length-1;
        for(int i=0;i<10;i++){
            arr[i]=in.nextInt();
        }
        //System.out.println("
    }
}