
public class LastOccurence {

    public static int CheckKey(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = CheckKey(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }

    public static void main(String[] args) {
        int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        int key = 5;
        int check = CheckKey(arr, key, 0);
        if (check != -1) {
            System.out.println("Key found at index " + check);
        } else {
            System.out.println("Key not found");
        }
    }
}
