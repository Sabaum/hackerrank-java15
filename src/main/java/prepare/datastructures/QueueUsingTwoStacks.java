package prepare.datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class QueueUsingTwoStacks {

    public static void main(String[] args) {
        List<String> commands = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int q = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < q; i++) {
            commands.add(scanner.nextLine());
        }

        processCommands(commands);
    }

    public static void processCommands(List<String> commands) {
        MyQueue<Integer> queue = new MyQueue<>();

        for (String command : commands) {
            String[] params = command.split(" ");
            int commandType = Integer.parseInt(params[0]);
            if (commandType == 1) {
                int commandParam = Integer.parseInt(params[1]);
                queue.enqueue(commandParam);
            } else if (commandType == 2) {
                queue.dequeue();
            } else {
                queue.printFirstElement();
            }
        }
    }


}

class MyQueue<Integer> {
    private final Stack<Integer> enqueueStack = new Stack<>();
    private final Stack<Integer> dequeueStack = new Stack<>();

    void enqueue(Integer value) {
        enqueueStack.push(value);
    }

    private void transferElements(Stack<Integer> fromStack, Stack<Integer> toStack) {
        while (!fromStack.empty()) {
            toStack.push(fromStack.pop());
        }
    }

    Integer dequeue() {
        if (dequeueStack.empty()) {
            transferElements(enqueueStack, dequeueStack);
        }
        return dequeueStack.pop();
    }

    public void printFirstElement() {
        if (dequeueStack.empty()) {
            transferElements(enqueueStack, dequeueStack);
        }
        System.out.println(dequeueStack.peek());
    }
}