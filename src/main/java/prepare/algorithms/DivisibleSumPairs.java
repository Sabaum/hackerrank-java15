package prepare.algorithms;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DivisibleSumPairs {

    /**
     * <a href="https://www.hackerrank.com/challenges/divisible-sum-pairs">Divisible Sum Pairs</a>
     * Complete the 'divisibleSumPairs' function below.
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER k
     *  3. INTEGER_ARRAY ar
     */
    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        int foundPairs = 0;

        for (int i = 0; i < n - 1; i++) {
            int currValI = ar.get(i);
            for (int j = i + 1; j < n; j++) {
                int currValJ = ar.get(j);

                if ((currValI + currValJ) % k == 0) {
                    foundPairs++;
                }
            }
        }

        return foundPairs;
    }

}
