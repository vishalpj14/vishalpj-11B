import java.util.*;
public class mirrorMatrix{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the order of array");
        int o=in.nextInt();
        int a[][]=new int[o][o];
        System.out.println("Input array");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                a[i][j]=in.nextInt();
            }
        }
        int b[][]=new int[o][o];
        for(int i=0;i<o;i++){
            for(int j=0;j<o;j++){
                b[i][j]=a[i][(o-1)-j];
            }
        }
        System.out.println("Original Matrix");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Mirrored matrix");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    } 
}