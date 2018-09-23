package generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExerTwo {
    public void print(List<Integer> list) {

        System.out.println(list);
        Iterator itr = list.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
    }

    public static void main(String[] args) {
        ExerTwo exerTwo = new ExerTwo();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        exerTwo.print(list);
    }
}
