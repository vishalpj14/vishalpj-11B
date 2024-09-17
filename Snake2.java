import java.util.*;

public class Snake2{
    char[][] GUI;
    int LENGTH;
    int ROW;
    int COLUMN;
    boolean COLLIDE;
    Snake2(char[][] gui, int l,int r, int c){
        GUI=gui;
        LENGTH=l;
        ROW=r;
        COLUMN=c;
    }
    void guiDefaultInit(){
        for(int i=ROW;i>0;i--){
            for(int j=0;j<COLUMN;j++){
                GUI[i][j]='.';
            }
        }
    }
    void printGui(){
        for(int i=ROW;i>0;i--){
            for(int j=0;j<COLUMN;j++){
                System.out.print(GUI[i][j]);
            }
            System.out.println();
        }
    }
    void gameController(){
        guiDefaultInit();
        defaultSnakeHead();
        while(!COLLIDE){
            inputHandler();
        }
        
    }
    void defaultSnakeHead(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter x and y coordinates of snake head");
        //y is row
        //x is column
        int x=in.nextInt();
        int y=in.nextInt();
        for(int i=ROW;i>0;i--){
            for(int j=0;j<COLUMN;j++){
                GUI[i][j]='O';
                for(int k=1;k<=LENGTH;k++){
                    GUI[i][j+k]='o';
                }
            }
        }
    }
    void inputHandler(){
        printGui();
        Scanner in=new Scanner(System.in);
        char f=in.next().charAt(0);
        if(f=='W'||f=='w'){
            snakeMoverUtil(1);
        }
        if(f=='A'||f=='a'){
            snakeMoverUtil(2);
        }
        if(f=='S'||f=='s'){
            snakeMoverUtil(3);
        }
        if(f=='D'||f=='d'){
            snakeMoverUtil(4);
        }
    }
    void snakeMoverUtil(int c){
        for(int i=ROW;i>0;i--){
            for(int j=0;j<COLUMN;j++){
                if(GUI[i][j]=='O'){
                    if(c==1){
                        GUI[i+1][j]='O';
                    }
                }
            }
        }
    }
    public static void main(String args[]){
    }
}