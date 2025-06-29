public class BinToDec {
    public static void main(String... args) {
        // int bin = 10110;
        // System.out.println(binToDecimal(bin));
        // DeciToBin(10);
        System.out.println(Integer.parseInt("1010", 2));
        System.err.println(Integer.toBinaryString(10));

    }

    public static int binToDecimal(int bin) {
        int pow = 0;
        int deci = 0;
        while (bin > 0) {
            int lastDigi = bin % 10;
            deci = deci + (lastDigi * (int) (Math.pow(2, pow)));
            pow++;
            bin /= 10;
        }
        return deci;
    }

    public static void DeciToBin(int Deci) {
        int rem = 0;
        while (Deci > 0) {
            rem = Deci % 2;
            System.out.print(rem);
            Deci /= 2;
        }
    }

}