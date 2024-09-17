// program 15 page 409
// Record #12
import java.util.*;

public class Display_word{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter string");
        String s=in.nextLine();
        Display_word ob=new Display_word();
        ob.Longest(s);
    
    }
    void Longest(String wd){
        String longest="",mid="";
        wd.trim();
        char w=wd.charAt(wd.length()-1);
        if(!(Character.isLetter(w))){
            wd.replace(wd.charAt(wd.length()-1),' ');
        }else{
            wd=wd.concat(" ");
        }
        for(int i=0;i<wd.length();i++){
            char c=wd.charAt(i);
            if(c==' '){
                if(longest.length()<mid.length()){
                    longest=mid;
                    mid="";
                }else{
                    mid="";
                }
            }else{
                mid=mid+c;
            }
        }
        System.out.println("Longest word: "+longest);
        System.out.println("ASCII Code of each letter");
        for(int i=0;i<longest.length();i++){
            char c=longest.charAt(i);
            System.out.println("Character "+c+" ASCII Code:"+((int)c));
        }
    }
}