


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
        // int a=0;
        // int b=1;
        // int count=2;
        // int n=4;
        // while(count<=n){
        //     int temp=b;
        //     b=a+b;
        //     a=temp;
        //     count++;
        // }
        // System.out.println(b);
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
        // for(int i=100;i<=1000;i++){
        //     if(isArmstrong(i)){
        //         System.out.print(i+" ");
        //     }
        // }
        //Patterns
        // 1
        // int n=5;
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        //2
        // int n=5;
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n-i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        //3
        // char ch='A';
        // for (int i = 0; i < 4; i++) {
        //     for(int j=0;j<=i;j++){
        //         System.out.print(ch);
        //         ch++;
        //     }
        //     System.out.println();
        // }
        //4 Square Hollow Pattern
        // int n=4;
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j <= n; j++) {
        //         if(i==0 || j==0 || i==n-1 || j==n){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");    
        //         }
        //     }
        //     System.out.println("");
        // }
        //5 Number Triangle Pattern
        // int n=6;
        // int count=1;
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n-i; j++) {
        //         System.err.print(" ");
        //     }
        //     for (int j = 0; j <= i;j++) {
        //         System.out.print(count+" ");
        //     }
        //     count++;
        //     System.out.println("");
        // }
        //Number-Increasing Pyramid Pattern
        // int n=6;
        // for (int i = 0; i < n; i++) {
        //     int count=1;
        //     for (int j = 0; j <= i;j++) {
        //         System.out.print(count+" ");
        //         count++;
        //     }
        //     System.out.println("");
        // }
        //Number-Increasing Reverse Pyramid Pattern 
        // int n=6;
        // for (int i = 0; i < n; i++) {
        //     int count=1;
        //     for (int j = 0; j < n-i;j++) {
        //         System.out.print(count+" ");
        //         count++;
        //     }
        //     System.out.println("");
        // }
        //Number-Changing Pyramid Pattern
        // int n=6;
        // int count=1;
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<=i;j++){
        //         System.out.print(count +" ");
        //         count++;
        //     }
        //     System.out.println();
        // }
        // int n=6;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         if((i+j)%2==0){
        //             System.out.print(1+" ");
        //         }else{
        //             System.out.print(0+" ");
        //         }
        //     }
        //     System.out.println();
        // }
        //Palindrome Triangle Pattern
        // int n=6;
        // for (int i = 1; i <= n; i++) {
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=i;j>=1;j--){
        //         System.out.print(j);
        //     }
        //     for(int j=2;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();       
        // }
        // Rhombus pattern
        // int n=6;
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=0;j<n;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // Diamond Star Pattern
        // int n=6;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n-i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <=2*i-1 ; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for (int i = n-1; i >=1; i--) {
        //     for (int j = 1; j <= n-i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <=2*i-1 ; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        //     //Butterfly Star Pattern
        //     int n=6;
        //     for (int i = 1; i <=n; i++) {
        //         for (int j = 1; j <=i; j++) {
        //             System.out.print("*");
        //         }
        //         for (int j = 1;j<=2*n-2*i; j++) {
        //             System.out.print(" ");
        //         }
        //         for (int j = 1; j <=i; j++) {
        //             System.out.print("*");
        //         }
        //         System.out.println();
        //     }
        //     for (int i = n; i >=1; i--) {
        //         for (int j = 1; j <=i; j++) {
        //             System.out.print("*");
        //         }
        //         for (int j = 1;j<=2*n-2*i; j++) {
        //             System.out.print(" ");
        //         }
        //         for (int j = 1; j <=i; j++) {
        //             System.out.print("*");
        //         }
        //         System.out.println();
        //     }
        // }
        // static boolean isArmstrong(int num) {
        //     int original = num;
        //     int sum = 0;
        //     while (num > 0) {
        //         int rem = num % 10;
        //         sum += rem * rem * rem;
        //         num /= 10;
        //     }
        //     return original==sum;
        // int n=6;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<i;j++){
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <= n-i+1; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }
        // int n = 6;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n-i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println("");
        // }
        // int n=6;
        // for (int i = 1; i <=n; i++) {
        //     for(int j=1;j<i;j++){
        //         System.out.print(" ");
        //     }
        //     for (int j = i; j <=n; j++) {
        //         System.out.print(j+" ");
        //     }
        //     System.out.println("");  
        // }        
        // for (int i = n-1; i >=1; i--) {
        //     for(int j=1;j<i;j++){
        //         System.out.print(" ");
        //     }
        //     for (int j = i; j <=n; j++) {
        //         System.out.print(j+" ");
        //     }
        //     System.out.println("");  
        // }       
        // Hollow Triangle Pattern
        // int n=6;
        // for (int i = 1; i <= n; i++){
        //     for (int j = 1; j <= n-i; j++) {
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=2*i-1;j++){
        //         if(i==1 || j==1 || i==n || j==2*i-1){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println("");
        // }
        // Hollow Triangle Pattern reverse
        // int n=6;
        // for (int i = n; i >= 1; i--){
        //     for (int j = 1; j <= n-i; j++) {
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=2*i-1;j++){
        //         if(i==1 || j==1 || i==n || j==2*i-1){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println("");
        // }
        // Hollow Diamond Star
        // int n=6;
        // for (int i = 1; i <=n; i++) {
        //     for (int j = 1; j <=n-i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j<=2*i-1; j++) {
        //         if(i==1 || j==1 || j==2*i-1){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println("");
        // }
        // for (int i = n-1; i >=1; i--) {
        //     for (int j = 1; j <=n-i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j<=2*i-1; j++) {
        //         if(i==1 || j==1 || j==2*i-1 ){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println("");
        // }
        //Hollow Hourglass Pattern
        // int n = 6;
        // for (int i = n ; i >= 1; i--) {
        //     for (int j = 1; j <= n - i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <= 2 * i - 1; j++) {
        //         if (i == 1 || i == n || j == 1 || j == 2 * i - 1) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println("");
        // }
        // for (int i = 2; i <= n; i++) {
        //     for (int j = 1; j <= n - i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <= 2 * i - 1; j++) {
        //         if (i == 1 || i == n || j == 1 || j == 2 * i - 1) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println("");
        // }
        //pascal's triangle
        /*    1 
             1 1
            1 2 1
           1 3 3 1
          1 4 6 4 1
         */
        // int n=7;
        // for(int i=1;i<=n;i++){
        //     for (int j = 1; j <=n-i; j++) {
        //         System.out.print(" ");
        //     }
        //     int x=1;
        //     for (int j = 1; j <= i; j++){
        //         System.out.print(x+" ");   
        //         x=x*(i-j)/j;
        //     }
        //     System.out.println("");
        // }

        // The Number Pattern
        // int n=4;
        // for (int i = 0; i < 2*n-1; i++) {
        //     for (int j = 0; j < 2*n-1; j++) {
        //         int top=i;
        //         int left=j;
        //         int bottom=2*n-2-i;
        //         int right=2*n-2-j;
        //         int minIndex=Math.min(Math.min(top,bottom),Math.min(left,right));
        //         System.out.print(n-minIndex+" ");
        //     }
        //     System.out.println("");
        // } 

        //GCD or HCF
        // int a=15,b=20;
        // int n1=a,n2=b;
        // while(a>0 && b>0){
        //     if(a>b){
        //         a=a%b;
        //     }else{
        //         b=b%a;
        //     }
        // }
        // if(a==0){
        //     System.out.println("GCD of " + n1 + " and " + n2 + " is: " + b);
        // }else{
        //     System.out.println("GCD of " + n1 + " and " + n2 + " is: " + a);
        // }
        //Armstrong
        int n=153;
        int temp=n;
        int sum=0;
        int len=String.valueOf(n).length(); //calculate length of number
        while(temp>0){
            sum+=(int)Math.pow(temp%10,len);
            temp/=10;
        }
        System.out.println("is Armstrong : "+(n==sum));
    }
}
