
import java.util.*;

public class InBuiltSort {

    public static void printArray(Integer arr[]) {
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void main(String args[]) {
        int arr[] = {4, 3, 6, 6, 1, 2};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        //reverseOrder() fuction object pe kam krta hai vo simple primitive int se kam nhi krega 
        //Isliye Integer objecct use kiye
        Integer nums[] = {3, 5, 6, 2, 1, 9, 3};
        Arrays.sort(nums, Collections.reverseOrder());
        printArray(nums);
    }
}
