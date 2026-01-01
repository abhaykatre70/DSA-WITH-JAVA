
public class revision {

    static public void main(String[] args) {

        //switch
        // int day = 5;
        // String dayString;
        // dayString = switch (day) {
        //     case 1 -> "Monday";
        //     case 2 -> "Tuesday";
        //     case 3 -> "Wednesday";
        //     case 4 -> "Thursday";
        //     case 5 -> "Friday";
        //     case 6 -> "Saturday";
        //     case 7 -> "Sunday";
        //     default -> "Invalid day";
        // }; 
        // System.out.println(dayString);
        //prime number
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter number : ");
        // int num = sc.nextInt();
        // boolean flag=true;
        // if(num<2){
        //     flag=false;
        // }
        // else{
        //     for(int i=2;i*i<=num;i++){
        //         if(num%i==0){
        //             flag=false;
        //             break;
        //         }
        //     }
        // }
        // if(flag){
        //     System.out.println("Prime number");
        // }else{
        //     System.out.println("Not prime");
        // }
        //fibonacci series
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter number: ");
        // int n = sc.nextInt();
        // if (n < 1) {
        //     System.out.println("Enter number greater than 0");
        // } else {
        //     int a = 0;
        //     int b = 1;
        //     if(n>=1){
        //         System.out.print(a+" ");
        //     }
        //     if(n>=2){
        //         System.out.print(b+" ");
        //     }
        //     for (int i =2; i <=n; i++) {
        //         int curr = b;
        //         b=b+a;
        //         a = curr;
        //         System.out.print(b + " ");
        //     }
        // }
        // //Count Occurrences
        // int n=103330343;
        // int temp=n;
        // int Count=0;
        // while(temp>0){
        //     int Lastdigit=temp%10;
        //     if(Lastdigit==3){
        //         Count++;
        //     }
        //     temp/=10;
        // }
        // System.out.println(Count);
        //reverse number
        // int n=103827327;
        // int rev=0;
        // while(n>0){
        //     int LD=n%10;
        //     rev=rev*10+LD;
        //     n/=10;
        // }
        // System.out.println(rev);
        // int[] arr={1,3,5,3,4};
        // System.out.println(Arrays.toString(arr));
        //Armstrong Num
        for(int i=100;i<=1000;i++){
            if(isArmstrong(i)){
                System.out.print(i+" ");
            }
        }

    }

    static boolean isArmstrong(int num) {
        int original = num;
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            sum += rem * rem * rem;
            num /= 10;
        }
        return original==sum;
    }
}
