// page 554 
//#2

class Area extends Perimeter{
    double h;
    double area;
    Area(double a, double b, double ah){
        super(a,b);
        h=ah;
    }
    void doarea(){
        area=super.b*h;
    }
    void show(){
        super.show();
        System.out.println("Height :"+h);
        System.out.println("Area :"+area);
    }
}