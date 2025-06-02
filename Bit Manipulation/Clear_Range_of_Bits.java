
public class Clear_Range_of_Bits {

    public static int clearrangeofbits(int n, int i, int j) {
        //Example
        //10 is 0001010
        //i=2,j=4
        int a = (~0) << (j + 1);//a=1100000
        int b = (1 << i) - 1;//b=0000011
        int bitMask = a | b;//bitMask=1100011
        return n & bitMask; // output 0000010 i.e 2
    }

    public static void main(String[] args) {
        System.out.println(clearrangeofbits(10, 2, 4));
    }
}
