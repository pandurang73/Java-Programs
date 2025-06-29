public class MaxInArray {
    public static void main(String... args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int checkSum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                    checkSum += arr[k];
                    maxSum = Integer.max(checkSum, maxSum);

                }
                System.out.print(" = " + checkSum);
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Maximum subarray sum is : " + maxSum);
    }
}