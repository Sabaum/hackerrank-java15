package prepare.interviewpreparation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SherlockAndAnagrams {

    /**
     * <a href="https://www.hackerrank.com/challenges/sherlock-and-anagrams">Sherlock and Anagrams</a>
     * Complete the 'sherlockAndAnagrams' function below.
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */
    public static int sherlockAndAnagrams(String s) {
        Map<String, Integer> dictionary = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                char[] curChars = s.substring(i, j + 1).toCharArray();
                Arrays.sort(curChars);
                String curString = new String(curChars);

                dictionary.putIfAbsent(curString, 0);
                dictionary.put(curString, dictionary.get(curString) + 1);
            }
        }

        int count = 0;
        for (Map.Entry<String, Integer> entry : dictionary.entrySet()) {
            Integer value = entry.getValue();
            if (value > 1) {
                count+= value*(value-1)/2;
            }
        }

        return count;
    }
}
