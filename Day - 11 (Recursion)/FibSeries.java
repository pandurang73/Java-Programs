public class FibSeries {
    public static void main(String... args) {
        fib(3);
    }

    public static int fib(int n) {

        if (n == 1)
            return 1;
        if (n == 0)
            return 0;

        return fib(n - 1) + fib(n - 2);

    }
}