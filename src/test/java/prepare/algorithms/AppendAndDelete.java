package prepare.algorithms;

public class AppendAndDelete {

    /**
     * <a href="https://www.hackerrank.com/challenges/append-and-delete">Append And Delete</a>
     * Complete the 'appendAndDelete' function below.
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. STRING t
     *  3. INTEGER k
     */
    public static String appendAndDelete(String s, String t, int k) {
        if (k >= s.length() + t.length()) {
            return "Yes";
        }
        int changes = 0;
        for (int i = 0; i < s.length(); i++) {
            Character target = s.charAt(i);
            Character current = t.length() <= i ? null : t.charAt(i);
            if (current == null || target != current) {
                changes += s.length() - i;
                changes += t.length() - i;
                break;
            }
        }
        if (t.length() > s.length()) {
            changes += t.length() - s.length();
        }

        if (changes == k ) {
            return "Yes";
        } else if ((k - changes) > 0 && (k - changes) % 2 == 0){
            return "Yes";
        } else {
            return "No";
        }
    }
}
