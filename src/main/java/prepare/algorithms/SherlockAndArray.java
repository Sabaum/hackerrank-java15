package prepare.algorithms;

import java.util.List;

public class SherlockAndArray {

    /**
     * <a href="https://www.hackerrank.com/challenges/sherlock-and-array">Sherlock And Array</a>
     * Complete the 'balancedSums' function below.
     * The function is expected to return a STRING.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
    public static String balancedSums(List<Integer> arr) {
        for (int i = arr.size() - 1; i > 0; i--) {
            if (arr.get(i) == 0) {
                arr.remove(i);
            }
        }
        if (arr.size() == 1) {
            return "YES";
        }
        int leftSum = 0;
        int rightSum = 0;
        int leftIndex = 0;
        int rightIndex = arr.size() -1;
        while (leftIndex < rightIndex) {
            if (leftSum <= rightSum) {
                leftSum += arr.get(leftIndex++);
            } else {
                rightSum += arr.get(rightIndex--);
            }
            if (rightIndex - leftIndex == 0 && rightSum == leftSum) {
                return "YES";
            }
        }
        return "NO";
    }
}
