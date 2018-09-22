package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListWithIteratorDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println("Initial size of arrayList " + list.size());
        list.add("c");
        list.add("b");
        list.add("a");
        list.add("d");
        list.add("e");
        list.add("f");
        System.out.println("After add element in arrayList " + list.size());

        System.out.println("List of data using Iterator ");
        Iterator itr = list.iterator();

    /*    while (itr.hasNext()) {
            System.out.println(" " + itr.next());
        }*/

        while (itr.hasNext()) {
            if (itr.next().equals("f"))
                itr.remove();
        }
        System.out.println("After delete element by ITR " + list.size());

        System.out.println("List Of element using foreach loop ");
        for (String str : list) {
            System.out.println(" " + str);
        }

    }
}
