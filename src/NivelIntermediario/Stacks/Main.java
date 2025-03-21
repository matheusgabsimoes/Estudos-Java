package NivelIntermediario.Stacks;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> ninjaStack = new Stack<>();
        ninjaStack.push("Naruto");
        ninjaStack.push("Sasuke");
        ninjaStack.push("Hinata");

        System.out.println("--------------------------");
        System.out.println("Stack atual: " + ninjaStack);

        System.out.println("--------------------------");

        ninjaStack.pop();
        System.out.println("Stack atual: " + ninjaStack);

        System.out.println("--------------------------");

        ninjaStack.push("Kakashi");
        System.out.println("Último da stack: " + ninjaStack.peek());
        
        System.out.println("--------------------------");

        System.out.println("Stack atual: " + ninjaStack);
        System.out.println("--------------------------");
    }
}
