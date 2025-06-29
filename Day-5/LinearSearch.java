public class LinearSearch {

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 6, 7 };
        int key = 1;

        boolean res = LinSearch(arr, key);
        if (res) {
            System.out.println("No is found ");
        } else {
            System.out.println("No. is not found");
        }
    }

    public static boolean LinSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return true;
            }

        }
        return false;
    }

}