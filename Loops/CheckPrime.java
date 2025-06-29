import java.util.Scanner;

public class CheckPrime {
    public static void main(String args[]) {

        int num = 10;
        boolean n = true;

        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                // System.out.println("the number is not prime");
                n = false;
            }
        }

        if (n == false) {
            System.out.println("num is not prime");
        } else {
            System.out.println("Is prime");
        }
        SumOfEvenAndOdd(num);

    }

    public static void SumOfEvenAndOdd(int num) {
        int even = 0, odd = 0;

        Scanner sc = new Scanner(System.in);
        for (int i = 2; i <= num; i++) {
            if (i % 2 == 0) {
                even += i;
            } else {
                odd += i;
            }
        }
        System.out.println(" In the range of " + num + " Odd and Even sum is :\n Odd is " + odd + "\n Even is " + even);

    }

}