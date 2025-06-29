import java.util.Arrays;

public class ReverseArr {
    public static void pairArr(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j < arr.length - 1; j++) {
                for (int k = i; k < j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int temp = 0;

        for (int i = 0; i < arr.length / 2 - 1; i++) {
            temp = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
            arr[i] = temp;
        }
        // System.out.println(Arrays.toString(arr));
        pairArr(arr);
    }
}
