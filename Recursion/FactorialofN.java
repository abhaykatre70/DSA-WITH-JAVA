
import java.util.*;

public class FactorialofN {

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            throw new IllegalArgumentException("Factorial for negative number is not Defined");
        }
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        System.out.println("Factorial of " + n + " is " + fact(n));
    }
}
