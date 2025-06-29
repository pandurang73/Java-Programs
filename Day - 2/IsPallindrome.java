import java.util.Scanner;

public class IsPallindrome {
    Scanner sc = new Scanner(System.in);

    public static boolean IsPallindrome(int num) {
        int n = 0;
        int isP = 0;
        int rev = num;
        for (int i = 0; num > 0; i++) {
            n = (num % 10);
            isP = isP * 10 + n;
            System.out.println(isP);
            num /= 10;
        }
        if (rev == isP) {
            return true;
        } else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(IsPallindrome(121));
    }
}
