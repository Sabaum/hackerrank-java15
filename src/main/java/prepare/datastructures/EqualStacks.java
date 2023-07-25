package prepare.datastructures;

import java.util.List;

public class EqualStacks {

    /**
     * <a href="https://www.hackerrank.com/challenges/equal-stacks">Equal Stacks</a>
     * Complete the 'equalStacks' function below.
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY h1
     *  2. INTEGER_ARRAY h2
     *  3. INTEGER_ARRAY h3
     */

    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        int stack1Size = 0;
        int stack2Size = 0;
        int stack3Size = 0;
        for (int i = h1.size() - 1; i >= 0; i--) {
            stack1Size += h1.get(i);
        }
        for (int i = h2.size() - 1; i >= 0; i--) {
            stack2Size += h2.get(i);
        }
        for (int i = h3.size() - 1; i >= 0; i--) {
            stack3Size += h3.get(i);
        }

        while (stack1Size != stack2Size || stack1Size != stack3Size)  {
            if (stack1Size > stack2Size || stack1Size > stack3Size) {
                int currentValue = h1.remove(0);
                stack1Size -= currentValue;
            }
            if (stack2Size > stack1Size || stack2Size > stack3Size) {
                int currentValue = h2.remove(0);
                stack2Size -= currentValue;
            }
            if (stack3Size > stack1Size || stack3Size > stack2Size) {
                int currentValue = h3.remove(0);
                stack3Size -= currentValue;
            }
        }

        return stack1Size;
    }

}
