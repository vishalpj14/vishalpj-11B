// snake game [im bored]

import java.util.*;
import java.util.concurrent.TimeUnit;

public class SnakeGame{
    void timeDelay(){
        try{
            TimeUnit.MILLISECONDS.sleep(30);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        
    }
    
    void graphics(){
    
    }
    
    void snakeHandler(String[][] gui,String[][] snake, int a, int b){
        Scanner in=new Scanner(System.in);
        // row and column to store the loc of entire snake
        // third box to store head loc
        // third box 0 if not head 1 if yes head
        char f;
        //# w > up
        //# a > left
        //# s > down
        //# d > right
        f=in.next().charAt(0);
        if(f=='W'||f=='w'){
            for(int i=0;i<a;i++){
                for(int j=0;j<b;j++){
                    if(snake[i][j]=="O"){
                        if(snake[i-1][j]=="o"){
                            System.out.println("Collided");
                            System.exit(0);
                        }else{
                            snake[i-1][j]="O";
                            snake[i][j]="o";
                            
                        }
                    }
                }
            }
        }
        if(f=='A'||f=='a'){
            for(int i=0;i<a;i++){
                for(int j=0;j<b;j++){
                    if(snake[i][j]=="O"){
                        if(snake[i][j-1]=="o"){
                            System.out.println("Collided");
                            System.exit(0);
                        }else{
                            String t;
                            t="O";
                            snake[i][j-1]=t;
                            gameProcessor(gui,snake);
                        }
                    }
                }
            }
            
        }
        if(f=='S'||f=='s'){
            for(int i=0;i<a;i++){
                for(int j=0;j<b;j++){
                    if(snake[i][j]=="O"){
                        if(snake[i+1][j]=="o"){
                            System.out.println("Collided");
                            System.exit(0);
                        }else{
                            String t;
                            t="O";
                            snake[i+1][j]=t;
                            gameProcessor(gui,snake);
                        }
                    }
                }
            }
            
        }
        if(f=='D'||f=='d'){
            for(int i=0;i<a;i++){
                for(int j=0;j<b;j++){
                    if(snake[i][j]=="O"){
                        if(snake[i][j+1]=="o"){
                            System.out.println("Collided");
                            System.exit(0);
                        }else{
                            String t;
                            t="O";
                            snake[i][j+1]=t;
                            gameProcessor(gui,snake);
                        }
                    }
                }
            }
        }
        
        
    }
    
    void defaultGraphics(String[][] gui,int a,int b){
        // default 20*80 a=20,b=80
        //String gui[][]=new String[20][80];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                gui[i][j]=".";
            }
        }
        
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                System.out.print(gui[i][j]);
            }
            System.out.println();
        }
    }
    void printGraphics(String[][] gui,int a,int b){
        for(int i=0;i<a;i++){
            System.out.print(i+" ");
            for(int j=0;j<b;j++){
                System.out.print(gui[i][j]);
            }
            System.out.println();
        }
    }
    void gameProcessor(String[][] gui, String[][] snake){
        for(int i=0;i<20;i++){
            for(int j=0;j<80;j++){
                if(snake[i][j]==("o")){
                    gui[i][j]="o";
                }else if(snake[i][j]=="O"){
                    gui[i][j]="O";   
                }
            }
        }
        printGraphics(gui,20,80);
        snakeHandler(gui,snake,20,80);
    }
    
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String[][] gui=new String[20][80];
        SnakeGame o=new SnakeGame();
        o.defaultGraphics(gui,20,80);
        String[][] snake=new String[20][80];
        System.out.println("Enter size of snake");
        int f=in.nextInt();
        for(int i=0;i<f;i++){
            if(i==0){
                snake[10][36+i]="O";
            }else{
            snake[10][36+i]="o";
        }
        }
        o.gameProcessor(gui,snake);
    }
    
    
    
    
}