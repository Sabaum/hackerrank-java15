package prepare.datastructures;

import java.util.List;
import java.util.Stack;

public class PoisonousPlants {

    /**
     * <a href="https://www.hackerrank.com/challenges/poisonous-plants">Poisonous Plants</a>
     * Complete the 'poisonousPlants' function below.
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY p as parameter.
     */

    public static int poisonousPlants(List<Integer> p) {
        Stack<PlantResult> stack = new Stack<>();
        int daysCounter = 0;
        for (int i = p.size() - 1; i >= 0; i--) {
            int currentPesticide = p.get(i);
            int currentDays = 0;
            while (!stack.empty() && stack.peek().pesticide > currentPesticide) {
                if (stack.peek().daysSurvived > currentDays) {
                    currentDays = stack.peek().daysSurvived;
                } else {
                    currentDays++;
                }
                stack.pop();
            }
            stack.push(new PlantResult(currentPesticide, currentDays));
            daysCounter = Math.max(daysCounter, currentDays);
        }
        return daysCounter;
    }



    private static int resolve(List<Integer> p, boolean allPlantsSurvived, int daysCounter) {
        while (!allPlantsSurvived) {
            allPlantsSurvived = true;
            daysCounter++;
            for (int i = (p.size() - 1); i > 0; i--) {
                if (p.get(i) > p.get(i - 1)) {
                    p.remove(i);
                    allPlantsSurvived = false;
                }
            }
        }
        return daysCounter;
    }
}

class PlantResult {
    final Integer pesticide;
    final Integer daysSurvived;

    PlantResult(Integer pesticide, Integer daysSurvived) {
        this.pesticide = pesticide;
        this.daysSurvived = daysSurvived;
    }
}
