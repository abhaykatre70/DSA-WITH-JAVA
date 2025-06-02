public class Update_ith_Bit {

    public static int setithbit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static int clearithbit(int n, int i) {
        // 1 << i creates a bitmask with 1 at ith position, e.g., 1 << 1 = 0010
        // ~ (NOT operator) flips all bits, so ~0010 = 1101
        // When we AND with this mask (n & 1101), it clears the ith bit
        int bitMask = ~(1 << i);
        return n & bitMask;
    }
    public static int updateithbit(int n, int i,int newBit) {
        //Method 1
        // if(newBit==0){
        //     return clearithbit(n, i);
        // }else{
        //     return setithbit(n, i);
        // }
        // Method 2;
        n=clearithbit(n, i);
        int BitMask=newBit<<i;
        return n|BitMask;

    }

    public static void main(String[] args) {
        System.out.println(updateithbit(10, 2, 1)); // Output: 14
    }
}
