public class SubstringOccurrences {
    public static void main(String[] args) {
        String str = "abcabcabc";
        String sub = "abc";
        int count = 0;

        for (int i = 0; i <= str.length() - sub.length(); i++) {
            if (str.substring(i, i + sub.length()).equals(sub))
                count++;
        }

        System.out.println("Occurrences: " + count);
    }
}
