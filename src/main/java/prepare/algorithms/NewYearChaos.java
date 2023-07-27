package prepare.algorithms;

import java.util.List;

public class NewYearChaos {

    /**
     * <a href="https://www.hackerrank.com/challenges/new-year-chaos">New Year Chaos</a>
     * Complete the 'minimumBribes' function below.
     * The function accepts INTEGER_ARRAY q as parameter.
     */

    public static void minimumBribes(List<Integer> q) {
        if (tooChaoticState(q)) {
            System.out.println("Too chaotic");
        } else {
            System.out.println(countBribes(q));
        }

    }

    private static boolean tooChaoticState(List<Integer> q) {
        for (int i = 0; i < q.size(); i++) {
            if (i + 3 < q.get(i)) {
                return true;
            }
        }
        return false;
    }

    private static int countBribes(List<Integer> q) {
        boolean isChaotic = false;
        int bribes = 0;
        for (int i = 0; i < q.size(); i++) {
            if (q.get(i) > (i + 1) && q.get(i+1) < q.get(i)) {
                bribes++;
                int aux = q.get(i);
                q.set(i, q.get(i+1));
                q.set(i+1, aux);
                isChaotic = true;
            }
        }
        if (isChaotic) {
            return bribes + countBribes(q);
        }
        return 0;
    }
}
