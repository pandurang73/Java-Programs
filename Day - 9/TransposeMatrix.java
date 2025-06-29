/*Question 3 :
Write a program to Find
Transpose
of
a Matrix.
What is Transpose?
Transpose of a matrix is the process of
swapping the
rows to columns
. For a 2x3 matrix,
Matrix
a11    a12    a13
a21    a22    a23
Transposed Matrix
a11    a21
a12    a22
a13    a23  */

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 2, 3, 4 }, { 9, 8, 6 }, { 2, 1, 2 } };

        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
}