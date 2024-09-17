//page 563 program 14
// Record #19
//#2

public class Supply extends Demand{
    int pproduced;
    double prate;
    Supply(String id,String name,int demand,int produced,double rate){
        super(id,name,demand);
        pproduced=produced;
        prate=rate;
    }
    double calculation(){
        return((prate*pdemand)-(prate*pproduced));
    }
    void display(){
        super.display();
        System.out.println("Difference in amountof demand and supply :"+ calculation());                   
    }
}