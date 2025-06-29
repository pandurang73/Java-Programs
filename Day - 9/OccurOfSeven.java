public class OccurOfSeven {
    public static void main(String... args) {

        int[][] arr = { { 1, 5, 2 },
                { 3, 6, 7 },
                { 9, 7, 4 },
                { 3, 2, 7 } };
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 7) {
                    count++;
                }
            }
        }

        System.out.println("All 7's occur " + count + " times");
    }
}