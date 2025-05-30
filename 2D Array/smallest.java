
import java.util.*;

public class smallest {

    public static void find(int matrix[][]) {
        int n = matrix.length, m = matrix[0].length;
        int smallest=Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(smallest>matrix[i][j]){
                    smallest=matrix[i][j];
                }
            }
        }
        System.out.println("Largest element is "+smallest);
    }

    public static void main(String args[]) {
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        find(matrix);
    }
}
