public class DiagonalSum {
    public static void main(String... args) {
        int[][] arr = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        int i = 0;
        int primary = 0;
        int secondary = 0;
        int j = arr.length - 1;
        while (i <= arr.length - 1) {
            primary += arr[i][i];
            secondary += arr[j][i];
            i++;
            j--;
        }
        System.out.println(secondary + primary);
    }
}
