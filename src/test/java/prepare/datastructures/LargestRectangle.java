package prepare.datastructures;

import java.util.List;

public class LargestRectangle {

    /**
     * <a href="https://www.hackerrank.com/challenges/largest-rectangle">Largest Rectangle</a>
     * Complete the 'largestRectangle' function below.
     * The function is expected to return a LONG_INTEGER.
     * The function accepts INTEGER_ARRAY h as parameter.
     */

    public static long largestRectangle(List<Integer> h) {
        int largestArea = 0;
        for (int i = 0; i < h.size(); i++) {
            int currentArea = 0;
            int currentHeight = h.get(i);
            int multiplierCount = 1;
            for (int j = i + 1; j < h.size(); j++) {
                if (h.get(j) < currentHeight) {
                    break;
                }
                multiplierCount++;
            }
            for (int j = i - 1; j >= 0; j--) {
                if (h.get(j) < currentHeight) {
                    break;
                }
                multiplierCount++;
            }
            currentArea = currentHeight * multiplierCount;
            if (largestArea < currentArea) {
                largestArea = currentArea;
            }
        }
        return largestArea;
    }
}
