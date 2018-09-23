package generics.genericMethod;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("foo");
        list.add("bar");
        list.add("ovi");

        System.out.println(GenericMethod.findElementInList("bar",list));
    }
}
