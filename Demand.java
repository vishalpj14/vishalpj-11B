//page 563 program 14
// Record #19
//#1

public class Demand {
    String pid;
    String pname;
    int pdemand;
    Demand(String id,String name,int demand){
        pid=id;
        pname=name;
        pdemand=demand;
    }
    void display(){
        System.out.println("Product ID :"+pid);
        System.out.println("Product Name :"+pname);
        System.out.println("Product Demand :"+pdemand);
    }
}
