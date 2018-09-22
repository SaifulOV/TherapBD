package collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo  {
    public static void main(String[] args) {
        Map<String ,String> map = new HashMap<>();
        System.out.println("The size Of map  "+map.size());
        map.put("siful" ,"ovi");
        map.put("shakil" ,"hossain");
        map.put("rakhi" ,"nusrat");

        System.out.println("The size Of map after value insert "+map.size());
        System.out.println(map.get("siful"));
        System.out.println(map.values());

    }
}
