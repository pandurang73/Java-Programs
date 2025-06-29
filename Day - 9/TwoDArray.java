import java.util.Scanner;

public class TwoDArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[4][4];
        System.out.println(arr.length);
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                System.err.print(arr[i][j] + " ");
            }
            System.out.println();

        }
    }
}