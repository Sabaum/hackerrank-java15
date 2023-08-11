package prepare.algorithms;

import java.util.Stack;

public class SuperReducedString {

    /**
     * <a href="https://www.hackerrank.com/challenges/reduced-string">Super Reduced String</a>
     * Complete the 'superReducedString' function below.
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */
    public static String superReducedString(String s) {
        Stack<Character> readLetters = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            Character currentChar = s.charAt(i);
            if (!readLetters.isEmpty()) {
                if (currentChar.equals(readLetters.peek())) {
                    readLetters.pop();
                } else {
                    readLetters.push(currentChar);
                }
            } else {
                readLetters.push(currentChar);
            }
        }
        if (readLetters.isEmpty()) {
            return "Empty String";
        } else {
            StringBuilder result = new StringBuilder();
            while (!readLetters.isEmpty()) {
                result.insert(0, readLetters.pop());
            }
            return result.toString();
        }
    }

}
