package collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue queue = new LinkedList();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println("Display element " + queue);
        try {
            queue.remove();
        } catch (Exception e) {
            System.out.println("empty queue");
        }
        System.out.println("Display element " + queue);
    }
}
