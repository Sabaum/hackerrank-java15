package prepare.algorithms;

import java.util.List;

public class PickingNumbers {

    /**
     * <a href="https://www.hackerrank.com/challenges/picking-numbers">Picking Numbers</a>
     * Complete the 'pickingNumbers' function below.
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */
    public static int pickingNumbers(List<Integer> a) {
        int biggestCount = 1;
        for (int i = 0; i < a.size(); i++) {
            int currentComparator = a.get(i);
            int greaterCount = 0;
            int lesserCount = 0;
            for (int currentNumber : a) {
                if (List.of(currentComparator, currentComparator - 1).contains(currentNumber)) {
                    lesserCount++;
                } else if (List.of(currentComparator, currentComparator + 1).contains(currentNumber)) {
                    greaterCount++;
                }
            }
            int maxCount = Math.max(lesserCount, greaterCount);
            if (maxCount > biggestCount) {
                biggestCount = maxCount;
            }
        }
        return biggestCount;
    }
}
