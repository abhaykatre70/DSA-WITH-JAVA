
public class DiagonalSum {

    public static void spiral(int matrix[][]) {
        int sum = 0;
        //Time Complexity is Big O (N*N)
        // for (int i = 0; i < matrix.length; i++) {
        //     for (int j = 0; j < matrix[0].length; j++) {
        //         //Primary Diagonal Sum
        //         if (i == j) {
        //             sum += matrix[i][j];
        //         }
        //         //Secondary Diagonal sum
        //         if (i + j == matrix.length - 1) {
        //             sum += matrix[i][j];
        //         }
        //     }
        // }
        // System.out.println("Diagonal Sum : "+ sum);

        //Optimized Code
        for (int i = 0; i < matrix.length; i++) {
            //Primary Diagonal sum
            sum+=matrix[i][i];
            //Secondary Diagonal sum
            

            //In Secondary diagonal  i+j = n-1 so ,here we can write j = n-1-i
            if(i!=matrix.length-1-i){                    //we have added conditon to avoid overlap
                sum+=matrix[i][matrix.length-1-i];    // i+j = n-1
            }
        }
        System.out.println("Diagonal Sum : "+ sum);
    }

    public static void main(String args[]) {
        int matrix[][] = {{1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12},
        {13, 14, 15, 16}};
        spiral(matrix);
    }
}
