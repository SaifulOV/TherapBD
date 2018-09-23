package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapWithIterDemo {
    public static void main(String[] args) {
        Map<String ,String> map = new HashMap<>();
        map.put("siful" ,"ovi");
        map.put("shakil" ,"hossain");
        map.put("rakhi" ,"nusrat");

        System.out.println("The size Of map "+map.size());

        Set set = map.entrySet();

        Iterator itr = set.iterator();
        System.out.println("....By Iterator....");
        while (itr.hasNext()){
            Map.Entry me = (Map.Entry) itr.next();
            System.out.print(me.getKey()+ " : ");
            System.out.println(me.getValue());
        }

        System.out.println("....By foreach Loop....");

        for (Map.Entry<String, String> itr1 : map.entrySet()) {
            System.out.print(itr1.getKey() + " : ");
            System.out.println(itr1.getValue());
        }


    }
}
