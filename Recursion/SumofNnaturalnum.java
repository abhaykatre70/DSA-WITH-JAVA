
import java.util.*;

public class SumofNnaturalnum {

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        if (n < 1) {
            throw new IllegalArgumentException("Enter number greater than 0");
        }
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        System.out.println("Sum of " + n + " Natural numbers is " + sum(n));
    }
}
