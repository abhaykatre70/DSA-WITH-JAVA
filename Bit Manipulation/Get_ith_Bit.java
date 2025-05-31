public class Get_ith_Bit {
    // Function to get the ith bit of number n
    public static int getithbit(int n, int i) {
        int bitMask = 1 << i;
        // bitMask shifts 1 to the left by i positions. For i=2, bitMask = 00000100 (which is 4)

        if ((n & bitMask) == 0) {
            // If the bitwise AND is 0, it means the ith bit is 0
            return 0;
        } else {
            // Otherwise, the ith bit is 1
            return 1;
        }
    }
    public static void main(String[] args) {
        System.out.println(getithbit(10, 2));  // Calling the method with n = 10, i = 2
    }
}
