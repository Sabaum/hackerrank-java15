package prepare.algorithms;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NonDivisibleSubset {

    /**
     * <a href="https://www.hackerrank.com/challenges/non-divisible-subset">Non Divisible Subset</a>
     * Complete the 'nonDivisibleSubset' function below.
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY s
     */
    public static int nonDivisibleSubset(int k, List<Integer> s) {
        // if there is at least one element divisible by k, then count starts as 1
        int count = 1;
        Map<Integer, List<Integer>> modMap = s.stream().collect(Collectors.groupingBy(it -> it % k));
        if (modMap.get(0) == null || modMap.get(0).isEmpty() ) {
            // if there is no element divisible by k, then count starts as 0
            count = 0;
        }

        // iterate over the elements until its half, comparing both ends
        for (int i = 1; i <= k/2; i++) {
            // if it has reached the exact half of k, then increments count by 1
            if (i * 2 == k) {
                if (modMap.get(i) != null && !modMap.get(i).isEmpty()) {
                    count += 1;
                }
                // for any value of i < k/2, checks both ends, and increments the count by whoever has more occurrences
            } else {
                count += Math.max(sizeOf(modMap.get(i)), sizeOf(modMap.get(k-i)));
            }
        }
        return count;
    }

    private static int sizeOf(List<Integer> list) {
        return list == null ? 0 : list.size();
    }

}
