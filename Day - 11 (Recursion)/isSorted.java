public class isSorted {
    public static void main(String... args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 1, 2, 5, 4, 5 };
        int i = 0;
        System.out.println(isSort(arr1, i));
        System.out.println(isSort(arr2, i));
    }

    public static boolean isSort(int[] arr, int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSort(arr, i + 1);

    }
}