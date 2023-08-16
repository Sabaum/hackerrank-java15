package prepare.algorithms;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Pairs {

    /**
     * <a href="https://www.hackerrank.com/challenges/pairs">Pairs</a>
     * Complete the 'pairs' function below.
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY arr
     */
    public static int pairs(int k, List<Integer> arr) {
        Set<Integer> uniqueNumbers = new HashSet<>(arr);

        int count = 0;
        for (int currentValue : arr) {
            int lowerTarget = currentValue - k;
            int higherTarget = currentValue + k;
            if (uniqueNumbers.contains(lowerTarget)) {
                count++;
            }
            if (uniqueNumbers.contains(higherTarget)) {
                count++;
            }
        }
        return count / 2;
    }
}
