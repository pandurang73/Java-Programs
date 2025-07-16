
public class SubSet {
    public static void findSet(String str, int i, String ans) {
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }

        findSet(str, i + 1, ans + str.charAt(i));
        findSet(str, i + 1, ans);
    }

    public static void main(String args[]) {
        findSet("abc", 0, "");
    }
}