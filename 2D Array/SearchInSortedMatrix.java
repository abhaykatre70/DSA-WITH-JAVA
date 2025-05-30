
public class SearchInSortedMatrix {

    //Time Complexity is Big O(n+m)
    // StairCase Search
    public static boolean search(int matrix[][], int key) {
        // //For Top to Bottom 
        // int row=0,col=matrix[0].length-1;
        // while(row<matrix.length && col>= 0){
        //     if(key==matrix[row][col]){
        //         System.out.println("Key found at "+"( "+row+" , "+col+" )");
        //         return true;
        //     }else if(key<matrix[row][col]){
        //         col--;
        //     }else{
        //         row++;
        //     }
        // }

        // For Bottom to Top
        int row = matrix.length - 1, col = 0;
        while (row >= 0 && col < matrix[0].length) {
            if (key == matrix[row][col]) {
                System.out.println("Key found at " + "( " + row + " , " + col + " )");
                return true;
            }else if(key<matrix[row][col]){
                row--;
            }else{
                col++;
            }
        }

        System.out.println("Key not found");
        return false;
    }

    public static void main(String args[]) {
        int matrix[][]
                = {{10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}};
        search(matrix, 33);
    }
}
