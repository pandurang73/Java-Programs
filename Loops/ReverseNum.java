public class ReverseNum {
    public static void main(String... args) {
        int num = 3092004;
        int rev = 0;

        // while (num != 0) {
        // rev = num % 10;
        // System.out.print(rev);
        // num /= 10;
        // }

        while (num != 0) {
            rev = (rev * 10) + num % 10;
            num /= 10;

        }
        System.out.println(rev);

    }
}