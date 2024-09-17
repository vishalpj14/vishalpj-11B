import java.util.*;
import java.util.concurrent.TimeUnit;
public class BingoGame{
    void ArrayGenerator(int q){
        
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number of players");
        int x=in.nextInt();
        int set[]=new int[25];
        for(int i=1;i<25;i++){
            set[i]=i;
        }
        int ddaset[][]=new int[5][5];
        int q=1;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                ddaset[i][j]=set[q];
                q++;
            }
        }
        BingoGame ob=new BingoGame();
        ob.ArrayOutput(ddaset);
        
    }
    void ArrayOutput(int arr[][]){
        for(int i=0;i<5;i++){
            System.out.println("---------------------------------------------------------------------------------");
            System.out.print("|"+"\t");
            for(int j=0;j<5;j++){
                System.out.print(arr[i][j]+"\t"+"|"+"\t");
                }
            System.out.println();
        }
        System.out.println("---------------------------------------------------------------------------------");
    }
}

