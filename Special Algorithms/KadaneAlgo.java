// The main use of Kadane's Algorithm is to find the maximum sum of a contiguous subarray within a one-dimensional array of numbers (which may include negative numbers). It efficiently solves the "Maximum Subarray Problem" in O(n) time. This is useful in problems involving financial analysis, signal processing, and anywhere you need to find the most profitable or optimal continuous segment in a sequence.

public class KadaneAlgo {
    public static void main(String args[]) {
        int arr[] = { -1, -2, -1 };
        kadaneForMaxInArray(arr);
        kadaneForMinSubarraySum(arr);
    }

    // for maximum subarray sum
    public static void kadaneForMaxInArray(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            if (currSum < 0) {
                currSum = 0;
            }

            maxSum = Integer.max(currSum, maxSum);
        }

        System.out.println("Max subarray sum is " + maxSum);
    }

    // for minimum subarray sum
    public static void kadaneForMinSubarraySum(int arr[]) {
        int minSum = Integer.MAX_VALUE;
        int currSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];

            if (currSum > 0) {
                currSum = 0;
            }

            minSum = Integer.min(currSum, minSum);
        }
        System.out.println("Minimum subarray sum is " + minSum);
    }
}