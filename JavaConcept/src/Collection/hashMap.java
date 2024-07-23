package Collection;

import java.util.HashMap;
import java.util.Map;

public class hashMap {

    //Creating HashMap
    HashMap map1 = new HashMap();
    HashMap<Integer, String> map = new HashMap<Integer, String>();

    public static void main(String args[]) {
        HashMap<Integer, String> hashMap = new HashMap<>();

        // Adding key-value pairs
        hashMap.put(1, "value1");
        hashMap.put(2, "value2");
        hashMap.put(3, "value3");

        // Getting a value
        System.out.println(STR."Key 1: \{hashMap.get(1)}"); // Key 1: value1

        // Removing a key-value pair
        hashMap.remove(2);

        // Size of the map
        System.out.println(STR."Size: \{hashMap.size()}"); // Size: 2

        // Check if empty
        System.out.println(STR."Is empty: \{hashMap.isEmpty()}"); // Is empty: false

        // Check if key exists
        System.out.println(STR."Contains key 3: \{hashMap.containsKey(3)}"); // Contains key 3: true

        // Check if value exists
        System.out.println(STR."Contains value 'value3': \{hashMap.containsValue("value3")}"); // Contains value 'value3': true

        // Iterate over the map
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(STR."Key: \{entry.getKey()}, Value: \{entry.getValue()}");
        }

        // Iterate over the map using forEach
        for (int k : hashMap.keySet()) {
            System.out.println(STR."Value of Element using keySet \{k} \{hashMap.get(k)}");
        }
    }
}
