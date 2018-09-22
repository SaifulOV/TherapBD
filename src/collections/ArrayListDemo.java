package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println("The Size of List " +list.size());
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        System.out.println("The Size of List " +list);
        System.out.println("The Size of List " +list.size());
        list.remove("d");
        System.out.println("The Size of List " +list.get(2));
        System.out.println("The Size of List " +list.contains("c"));
    }
}
