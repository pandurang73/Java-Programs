public class CharPatt {
    public static void main(String... args) {
        int a = 65;
        char ch = 's';
        char t = "a";

        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print((char) a);
                a++;
            }
            System.out.println();
        }

    }
}