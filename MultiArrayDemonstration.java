

package qn4.multiarraydemonstration;


public class MultiArrayDemonstration {

    public static void main(String[] args) {int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Matrix Elements:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
           
     }
   }
}
