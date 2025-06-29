public class SentenceFirstLetCap {
    public static void main(String args[]) {
        StringBuilder str = new StringBuilder("i am pandurang mhaske");

        Character.toUpperCase(str.charAt(0));

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                Character.toUpperCase(str.charAt(i + 1));
            }
        }

        System.out.println(str);
    }
}