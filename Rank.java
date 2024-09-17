//page 552 program 8
//#2

class Rank extends Record{
    int index;
    Rank(){
        super();
        index=0;
    }
    void highest(){
        for(int i=0;i<50;i++){
            if(rank[i]<rank[index]){
                index=i;
            }
        }
    }
    void display(){
        super.display();
        System.out.println("Topmost rank: "+name[index]);
    }
}