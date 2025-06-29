// Question  :
// Print out the sum of the numbers in
// the second row of the “nums” array.
// Example :
// Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
// Output - 18

public class SumOfSecondRow {
    public static void main(String args[]) {
        int arr[][] = { { 1, 2, 3, 4 }, { 2, 3, 4, 5 }, { 9, 8, 6, 5 } };

        int sum = 0;
        for (int i = 0; i < arr[0].length; i++) {
            sum += arr[1][i];
        }
        System.out.println("Sum of second row is : " + sum);
    }
}
