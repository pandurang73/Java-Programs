public class hello {
    public int sum(int n) {
        System.out.println(n);
        if (n == 0) {
            return n;
        }
        return n + sum(n - 1);
    }

    public static void main(String args[]) {
        hello h = new hello();
        System.out.println(h.sum(10));
    }
}