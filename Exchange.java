// page 451 
// Record #13
import java.util.Scanner;

public class Exchange{
    String sent;
    String rev;
    int size;
    Exchange(){
        sent="";
        rev="";
        size=sent.length();
    }
    void readsentence(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter string");
        sent=in.nextLine();
    }
    
    void exfirstlast(){
        String k=sent;
        String mid="";
        if(k.charAt(k.length()-1)=='.'){
            k=k.substring(0,k.length()-1);
        }
        k=k+" ";
        for(int i=0;i<k.length();i++){
            char c=k.charAt(i);
            if(c==' '){
                if(mid.length()==1){
                    rev=rev+mid+" ";
                    mid="";
                }if(mid.length()==2){
                    char f1=mid.charAt(0);
                    char f2=mid.charAt(mid.length()-1);
                    rev=rev+f2+f1+" ";
                    mid="";
                }if(mid.length()>2){
                    char f1=mid.charAt(0);
                    char f2=mid.charAt(mid.length()-1);
                    mid=mid.substring(1,mid.length()-1);
                    mid=f2+mid+f1;
                    rev=rev+mid+" ";
                    mid="";
                }
            }else{
                mid=mid+c;
            }
        }
        rev=rev.trim();
        rev=rev+'.';
    }
    void display(){
        System.out.println(rev);
        
    }
    public static void main(String args[]){
        Exchange o=new Exchange();
        o.readsentence();
        o.exfirstlast();
        o.display();
    }
}