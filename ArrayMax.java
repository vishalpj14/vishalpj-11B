//PG 451 qn 22

import java.util.*;

public class ArrayMax{
    int arr[][]=new int[10][10];
    int m=8;
    ArrayMax(int mm){
        int m=mm;
        int arr[][]=new int[m][m];
    } 
    void readarray(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter elements of an array");
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                System.out.println("Row "+i+" Column "+j);
                arr[i][j]=in.nextInt();   
            }
        }
    }
    void large(){
        for(int i=0;i<m;i++){
            int k=arr[i][0];
            for(int j=0;j<(m-1);j++){
                if(k<arr[i][j+1]){
                    k=arr[i][j+1];
                }
            }
            System.out.println("Largest value in row "+i+" is "+k);
        }
    }
    void display(){
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    
    }   
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter size of the array");
        int x=in.nextInt();
        ArrayMax ob=new ArrayMax(x);
        ob.readarray();
        ob.large();
        ob.display();
    }
}    