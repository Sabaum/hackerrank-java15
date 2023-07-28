package prepare.datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class SimpleTextEditor {

    /**
     * <a href="https://www.hackerrank.com/challenges/simple-text-editor">Simple Text Editor</a>
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfOperations = Integer.parseInt(scanner.nextLine());
        List<String> commands = new ArrayList<>(numberOfOperations);
        for (int i = 0; i < numberOfOperations; i++) {
            commands.add(scanner.nextLine());
        }

        processCommands(commands);
    }

    public static void processCommands(List<String> commands) {
        String currentState = "";
        Stack<String> savedStates = new Stack<>();
        for (String command : commands) {
            String[] params = command.split(" ");
            int operation = Integer.parseInt(params[0]);

            if (operation == 4) {
                // Undo operation
                currentState = savedStates.pop();
            } else {
                String param = params[1];

                if (operation == 1) {
                    // Append operation
                    savedStates.push(currentState);
                    currentState = currentState + param;
                } else if (operation == 2) {
                    // delete operation
                    savedStates.push(currentState);
                    currentState = currentState.substring(0, currentState.length() - Integer.parseInt(param));
                } else if (operation == 3) {
                    // print operation
                    System.out.println(currentState.charAt(Integer.parseInt(param) - 1));
                }
            }

        }
    }

}
