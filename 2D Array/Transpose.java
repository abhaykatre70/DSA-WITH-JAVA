
public class Transpose {

    public static void printMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void TransposeMatrix(int matrix[][]) {
        int Transpose[][]=new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                Transpose[j][i]=matrix[i][j];
            }
        }
        printMatrix(Transpose);
    }

    public static void main(String args[]) {
        int matrix[][] = {{1, 4, 9}, {2, 2, 3}};
        System.out.println("Current Matrix :");
        printMatrix(matrix);
        System.out.println("Transpose Matrix :");
        TransposeMatrix(matrix);
    }
}
