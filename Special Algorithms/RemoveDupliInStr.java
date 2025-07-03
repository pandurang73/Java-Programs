// Removing duplicate characters from string input = "paaannndddu" output= "pandu"

public class RemoveDupliInStr {
    public static void main(String... args) {
        remDuplicate("paannnddu", 0, new StringBuilder(""), new boolean[26]);
    }

    public static void remDuplicate(String str, int idx, StringBuilder newStr, boolean[] map) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        int currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            remDuplicate(str, idx + 1, newStr, map);

        } else {
            map[currChar - 'a'] = true;
            remDuplicate(str, idx + 1, new StringBuilder(newStr).append((char) (currChar)), map);
        }

    }
}