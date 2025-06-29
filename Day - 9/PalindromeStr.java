
public class PalindromeStr {
    public static void main(String... args) {
        String str = "maadaaam";

        boolean chk = false;

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                System.out.println("This string is not palindrome");
                chk = false;
                break;
            } else {
                chk = true;
            }
        }

        if (chk) {
            System.out.println("Given string is palindrome");
        }
    }
}