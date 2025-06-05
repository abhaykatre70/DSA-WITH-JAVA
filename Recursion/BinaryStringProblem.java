//print all binary Strings pf Size without Consecutive onces

public class BinaryStringProblem {

    public static void printBinaryString(int n, int lastplace, String str) {
        //basecase
        if (n == 0) {
            System.out.println(str);
            return;
        }
        //kaam
        printBinaryString(n - 1, 0, str + "0");
        if (lastplace == 0) {
            printBinaryString(n - 1, 1, str + "1");
        }

    }

    public static void main(String[] args) {
        printBinaryString(3, 0, "");
    }
}
