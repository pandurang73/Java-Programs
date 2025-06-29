public class SearchInSortedArray {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        int i = 0; // Start from first row
        int j = arr[0].length - 1; // Start from last column

        int key = 13;
        boolean found = false;

        while (i < arr.length && j >= 0) {
            if (arr[i][j] == key) {
                System.out.println("key is found at (" + i + ", " + j + ")");
                found = true;
                break;
            } else if (key < arr[i][j]) {
                j--;
            } else {
                i++;
            }
        }
        if (!found) {
            System.out.println("key is not found");
        }
    }
}