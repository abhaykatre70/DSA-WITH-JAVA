public class IncreasingOrder{
    public static void print(int i,int n) {
        
        if(i==n){
            System.out.print(i);
            return;
        }
        System.out.print(i+" ");
        print(i+1,n);
    }
    public static void main(String[] args) {
        print(1,10);
    }
}