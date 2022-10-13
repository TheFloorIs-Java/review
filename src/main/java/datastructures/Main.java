package datastructures;

public class Main {
    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<>();
        stringStack.push("stack item 1");
        stringStack.push("stack item 2");
        stringStack.push("stack item 3");
        System.out.println(stringStack.peek());
        stringStack.pop();
        System.out.println(stringStack.peek());
        stringStack.push("stack item 4");
        System.out.println(stringStack.peek());

    }
}
