//Check if number is a power of 2 or not
public class CheckPowerofTwo{
    public static boolean isPowerOfTwo(int n) {
        return (n&(n-1))==0;
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(8));
    }
}