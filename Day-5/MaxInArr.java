import java.util.Arrays;

public class MaxInArr {
    public static void main(String args[]) {
        int arr[] = { 23, 11, 53, 22, 5, 26 };
        // Arrays.sort(arr);
        // System.out.println(arr[arr.length - 1]);
        System.out.println(Max(arr));

    }

    public static int Max(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
