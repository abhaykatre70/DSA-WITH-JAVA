// Print Number form 1 to n in increasing Order
public class IncreasingOrder {
    public static void print(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        print(n - 1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        print(10);
    }
}
