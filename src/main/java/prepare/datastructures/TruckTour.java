package prepare.datastructures;

import java.util.List;

public class TruckTour {

    /**
     * <a href="https://www.hackerrank.com/challenges/truck-tour">Truck Tour</a>
     * Complete the 'truckTour' function below.
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY petrolpumps as parameter.
     */
    public static int truckTour(List<List<Integer>> petrolpumps) {
        int numberOfPumps = petrolpumps.size();
        for (int i = 0; i < numberOfPumps; i++) {
            List<Integer> currentPump = petrolpumps.get(i);
            Integer availablePetrol = currentPump.get(0);
            Integer distanceToNextPump = currentPump.get(1);
            if (availablePetrol > distanceToNextPump && resolveFor(i, petrolpumps)) {
                return i;
            }
        }

        throw new RuntimeException("unexpectedError");
    }

    private static boolean resolveFor(int currentIndex, List<List<Integer>> petrolpumps) {
        Integer totalPetrol = 0;
        int numberOfPumps = petrolpumps.size();
        for (int i = 0; i < numberOfPumps; i++) {
            List<Integer> currentPump = petrolpumps.get((currentIndex + i) % numberOfPumps);
            Integer availablePetrol = currentPump.get(0);
            Integer distanceToNextPump = currentPump.get(1);

            totalPetrol += availablePetrol;
            if (totalPetrol < distanceToNextPump) {
                return false;
            }
            totalPetrol -= distanceToNextPump;
        }
        return true;
    }
}
