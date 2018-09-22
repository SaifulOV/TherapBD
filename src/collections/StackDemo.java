package collections;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("Push Item " + stack);
        try {
            stack.pop();
        } catch (Exception e) {
            e.getStackTrace();
        }

        System.out.println("Push Item " + stack);
        System.out.println("search Item " + stack.search(3));
        System.out.println("search Item " + stack.search(6));
    }
}
