import java.util.*;

public class antiClockWiseLoop{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter order");
        int q=in.nextInt();
        int m[][]=new int[q][q];
        int s[]=new int[(q*q)+1];
        for(int i=1;i<=(q*q);q++){
            s[i]=i;
        }
        int k=1;
        int z=1;
        int x=(q*q)/2;
        int y=(q*q)/2;
        int f=1;
        for(int p=2;p<(q+2);p++){
            if((!(y>q))||(!(x>q))){
            while((y!=0)&&((x!=(q-1)))||z!=((q*q)+1)){
                if(f==1){
                    m[x][y]=s[z];
                    z++;
                    x++;
                    f++;
                }if(f==2){
                    m[x][y]=s[z];
                    z++;
                    y++;
                    f++;
                }if(f==3){
                    m[x][y]=s[z];
                    z++;
                    x--;
                    f++;
                }if(f==4){
                    m[x][y]=s[z];
                    z++;
                    y--;
                    f=1;
                }
            }}
        }
        // while(z<(q*q)+1){
            // m[x][y]=s[z];
            // z++;
            // x++;
            // m[x][y]=s[z];
            // y++;
            // z++;
            // m[x][y]=s[z];
            // z++;;
            // x--;
            // m[x][y]=s[z];
            // z++;
            // y--;
        // }
        
        print(m,q);
    }
        public static void print(int a[][],int m){
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}