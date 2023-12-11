import java.util.HashMap;
import java.util.Map;

public class Hasmaps_ {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(3, "Gojo");
        map.put(2, "Maki");
        map.put(10, "Toji");

        // Overriding the current key value
        // map.put(10, "Maki");

        // To prevent overriding we can use the following
        map.putIfAbsent(10, "Yuji");
        System.out.println(map.containsKey(1));

        System.out.println(map);

        // Traversing through the Map using Entry set
        for(Map.Entry<Integer,String> m : map.entrySet()){
            System.out.println(m.getKey() + " : " + m.getValue());
        }

        for(Integer e : map.keySet()){
            System.out.println(e);
        }

        for(String s: map.values()){
            System.out.println(s);
        }

    }
}
