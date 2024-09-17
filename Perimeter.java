//page 554 
//#1

class Perimeter{
    double a;
    double b;
    Perimeter(double pa, double pb){
        a=pa;
        b=pb;
    }
    double calculate(){
        return(2*a*b);
    }
    void show(){
        System.out.println("Length of a: "+a);
        System.out.println("Length of b: "+b);
        System.out.println("Perimeter: "+calculate());
    }
}