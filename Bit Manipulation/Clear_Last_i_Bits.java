public class Clear_Last_i_Bits {
    public static int clearilastbits(int n, int i) {
        int bitMask = ((-1) << i); //(-1) and (~0) both refers to 11111.... bits
        return n & bitMask;
    }

    public static void main(String[] args) {
        System.out.println(clearilastbits(15, 2)); // output 12
    }
}
