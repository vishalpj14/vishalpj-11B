// page 52 prog 8
//#1

import java.util.*;

class Record{
    String name[]=new String[50];
    int rank[]=new int[50];
    Record(){
        for(int i=0;i<50;i++){
            name[i]="";
            rank[i]=0;
        }
    }
    void readValues(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter name and rank");
        for(int i=0;i<50;i++){
            name[i]=in.nextLine();
            rank[i]=in.nextInt();
        }
    }
    void display(){
        for(int i=0;i<50;i++){
            System.out.println("Name :"+name[i]+"\t"+"Rank: "+rank[i]);
        }
    }
}