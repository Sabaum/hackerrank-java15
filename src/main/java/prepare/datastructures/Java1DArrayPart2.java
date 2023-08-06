package prepare.datastructures;

import java.util.*;

public class Java1DArrayPart2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfQueries = Integer.parseInt(scanner.nextLine());
        List<Integer> leaps = new ArrayList<>();
        List<String> games = new ArrayList<>();

        for (int i = 0; i < numberOfQueries; i++) {
            Integer leap = Integer.parseInt(scanner.nextLine().split(" ")[1]);
            leaps.add(leap);
            String game = scanner.nextLine();
            games.add(game);
        }

        canWin(leaps, games);
    }

    public static void canWin(List<Integer> leaps, List<String> games) {
        for (int i = 0; i < games.size(); i++) {
            int currentLeap = leaps.get(i);
            String[] currentGame = games.get(i).split(" ");
            boolean[] visited = new boolean[currentGame.length + currentLeap];

            if (canWinThisGame(currentLeap, currentGame, 0, visited) > 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    private static int canWinThisGame(int leap, String[] game, int currentPosition, boolean[] visited) {
        if (currentPosition >= game.length) {
            return 1;
        } else if (currentPosition < 0 || !game[currentPosition].equals("0")) {
            return 0;
        }
        if (visited[currentPosition]) {
            return 0;
        }

        visited[currentPosition] = true;
        int walkBackwards = canWinThisGame(leap, game, currentPosition - 1, visited);
        int walkForward = canWinThisGame(leap, game, currentPosition + 1, visited);
        int jump = canWinThisGame(leap, game, currentPosition + leap, visited);

        return walkBackwards + walkForward + jump;
    }
}
