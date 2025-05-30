
public class SumNumOfSecondRow {

    public static void spiral(int matrix[][]) {
        int sum = 0;
        int row = 1;
        for (int col = 0; col < matrix[0].length; col++) {
            sum += matrix[row][col];
        }
        System.out.println("Sum of the number in the Second row is " + sum);
    }

    public static void main(String args[]) {
        int matrix[][] = {{1, 4, 9}, {11, 4, 3}, {2, 2, 3}};
        spiral(matrix);
    }
}
