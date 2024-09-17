
public class insertionSort{
    public static void main(String args[]){}
    void insertion(int a[]){
        int n=a.length;
        for(int i=1;i<n;i++){
            int k=a[i];
            int j;
            for(j=i-1;(j>=0)&&(a[j]>k);j--){
                a[j+1]=a[j];
            }
            a[j+1]=k;
        }
    }
}