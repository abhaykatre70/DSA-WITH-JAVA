
public class FibonaccinNumber {

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fibo = fibonacci(n - 1) + fibonacci(n - 2);//Time Complexity=O(2pow(n)), Space complexity =O(n)
        return fibo;
    }

    public static void main(String[] args) {
        int n=10;
        System.out.println(fibonacci(n));
        // for (int i = 0; i<=n; i++) {
        //     System.out.print(fibonacci(i)+" ");
        // }
        
    }
}
