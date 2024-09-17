import java.util.Scanner;
public class BookShop{
    String title[];
    String author[];
    String publisher[];
    int amount[];
    int no;
    void initBookNumber(){
        System.out.println("Enter the amount of books you want to store");
        Scanner in=new Scanner(System.in);
        no=in.nextInt();
    }
    void init(){
        String title[]=new String[no];
        String author[]=new String[no];
        String publisher[]=new String[no];
        int amount[]=new int[no];
    }
    void inputList(){
        Scanner in=new Scanner(System.in);
        for(int i=0;i<no;i++){
            System.out.println("Enter book Details for book #"+i+": tuitle, author,publisher,amount of copies;");
            title[i]=in.next();
            author[i]=in.next();
            publisher[i]=in.next();
            amount[i]=in.nextInt();
        }
    }
    void checkList(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the book's title,author");
        String ntitle=in.next();
        String nauthor=in.next();
        int nno;
        for(int i=0;i<no;i++){
            if(nauthor==author[i]){
                if(ntitle==title[i]){
                    System.out.println("Book found");
                    System.out.println("Enter amount");
                    System.out.println(amount[i]+" remaining");
                    nno=in.nextInt();
                    if(nno<amount[i]){
                        System.out.println("Order successful");
                        amount[i]-=nno;
                    }
                }
            }
        }
        
    }
}

