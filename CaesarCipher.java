// Record #5

import java.util.*;

public class CaesarCipher{
    public static void main(String args[]){
        System.out.println("Enter string to cipher");
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        System.out.println(cipher(s));
    }
    public static String cipher(String c){
        String f="";
        for(int i=0;i<c.length();i++){
            char ch=c.charAt(i);
            if((((int)ch)>=65&&((int)ch)<=77)||(((int)ch)>=97&&((int)ch)<=109)){
                f=f+((char)((int)ch+13));
            }
            else if((((int)ch)>=78&&((int)ch)<=90)||(((int)ch)>=110&&((int)ch)<=122)){
                f=f+((char)((int)ch-13));
            }

            else{
                f=f+ch;
            }
        }
        return f;
    }
}
