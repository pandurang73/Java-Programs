public class TillingProblem {
    public static void main(String args[]) {
        System.out.println(tillingProb(5));
    }

    public static int tillingProb(int n) {
        // base case
        if (n == 0 || n == 1)
            return 1;

        int fnm1 = tillingProb(n - 1); // vertical choice
        int fnm2 = tillingProb(n - 2); // horizontal choice

        int totWays = fnm1 + fnm2;

        return totWays;
    }
}