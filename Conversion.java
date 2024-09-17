// Record #11

import java.util.*;
public class Conversion{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the word");
        String n=in.next();
        System.out.println(format(n));
    }
    static String format(String n){
        String f="";
        for(int i=0;i<n.length();i++){
            char ch=n.charAt(i);
            if(Character.isLowerCase(ch)){
                if(ch=='z'){
                    f=f+'A';
                }else{
                    f=f+(char)((int)(ch-31));
                }
            }else if(Character.isUpperCase(ch)){
                if(ch=='Z'){
                    f=f+'a';
                }else{
                     f=f+(char)((int)(ch+33));
                }
            }else{
                f=f+ch;
            }
        }
        return f;
    }
}