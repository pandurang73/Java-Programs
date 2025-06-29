public class BinarySearch {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int key = 2;

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == key) {
                System.out.println("value is found at position" + mid);
            }
            if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
    }
}
