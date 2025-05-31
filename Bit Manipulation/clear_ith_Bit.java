public class clear_ith_Bit {
    // Function to clear (set to 0) the ith bit of number n
    public static int clearithbit(int n, int i) {
        // 1 << i creates a bitmask with 1 at ith position, e.g., 1 << 1 = 0010
        // ~ (NOT operator) flips all bits, so ~0010 = 1101
        // When we AND with this mask (n & 1101), it clears the ith bit
        int bitMask = ~(1 << i); 
        return n & bitMask;
    }

    public static void main(String[] args) {
        System.out.println(clearithbit(10, 1)); // Output: 8
    }
}
