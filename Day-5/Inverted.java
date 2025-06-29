public class Inverted {
    public static void main(String... args) {
        int n = 4;
        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j <= n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = n - i - 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}