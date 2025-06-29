public class OccuranceChkStr {
    public static void main(String... args) {
        String str = "aaabbbaaaaaadddd";

        StringBuilder ch = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            ch.append(str.charAt(i));
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            ch.append(count);
        }

        System.out.println(ch);
    }
}
