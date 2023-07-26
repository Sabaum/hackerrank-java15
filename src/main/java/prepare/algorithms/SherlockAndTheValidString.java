package prepare.algorithms;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SherlockAndTheValidString {

    /**
     * <a href="https://www.hackerrank.com/challenges/sherlock-and-valid-string">...</a>
     * Complete the 'isValid' function below.
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */
    public static String isValid(String s) {
        Map<Character, Integer> charMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            charMap.putIfAbsent(currentChar, 0);
            charMap.put(currentChar, charMap.get(currentChar) + 1);

        }

        Map<Integer, Integer> possibleFrequencies = new HashMap<>();
        for (Map.Entry<Character, Integer> entry: charMap.entrySet()) {
            possibleFrequencies.putIfAbsent(entry.getValue(), 0);
            possibleFrequencies.put(entry.getValue(), possibleFrequencies.get(entry.getValue()) + 1);
        }

        if (possibleFrequencies.size() > 2) {
            return "NO";
        } else if (possibleFrequencies.size() == 2 && possibleFrequencies.containsKey(1) && possibleFrequencies.get(1).equals(1)) {
            return "YES";
        }

        int expectedFrequency = possibleFrequencies.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
        int difference = 0;
        Collection<Integer> charMapValues = charMap.values();
        for (Integer charsValue : charMapValues) {
            difference += Math.abs(charsValue - expectedFrequency);
        }

        return difference <= 1 ? "YES" : "NO";
    }

}
