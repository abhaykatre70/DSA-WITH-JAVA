
public class CheckOddandEven {

    public static void EvenOrOdd(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static void main(String[] args) {
        EvenOrOdd(5);
        EvenOrOdd(8);
        EvenOrOdd(11);
    }
}
