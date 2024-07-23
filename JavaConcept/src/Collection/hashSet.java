package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class hashSet {

    public static void main(String[] args) {

        HashSet hashSet = new HashSet();

        // Set mySet = new HashSet();
        // HashSet<String> set = new HashSet<String>();

        // Adding the Element in HashSet

        hashSet.add(100);
        hashSet.add(100.5);
        hashSet.add('S');
        hashSet.add("Java");
        hashSet.add(true);
        hashSet.add(100);
        hashSet.add(null);
        hashSet.add(null);

        System.out.println(STR."Printing the HashSet List\{hashSet}");
        // Printing the HashSet List[null, Java, S, 100, 100.5, true]

        System.out.println("-------------------------");

        // Size of HashSet
        System.out.println(hashSet.size());

        System.out.println("-------------------------");

        //Removing Element form HashSet

        hashSet.remove(100.5);

        System.out.println(STR."Printing the Remove list from HashSet List\{hashSet}");
        // Printing the Remove list from HashSet List[null, Java, S, 100, true]

        System.out.println("-------------------------");

        // Adding the Element is not Possible
        System.out.println("Adding the Element is not Possible");

        System.out.println("-------------------------");

        // Accessing the Specific Value from List is not Possible --- But Can be done myWork Around
        System.out.println("Accessing the Specific Value from List is not Possible --- But Can be done myWork Around");

        System.out.println("-------------------------");

        // Converting HashSet to ArrayList

        ArrayList myList = new ArrayList(hashSet);

        System.out.println(STR."Printing the All the Element from List \{myList}");
        //Printing the All the Element from List [null, Java, S, 100, true]

        System.out.println(STR."Printing the specific Element from List \{myList.get(1)}");
        // Printing the specific Element from List Java

        // Reading the HashSet List

        for (Object x : hashSet) {
            System.out.println(STR."Reading All the List From HashSet\{STR." \{x}"}");

            // Reading All the List From HashSet null
            // Reading All the List From HashSet Java
            // Reading All the List From HashSet S
            // Reading All the List From HashSet 100
            // Reading All the List From HashSet true
        }

        Iterator<Object> it = hashSet.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
            // null
            // Java
            // S
            // 100
            // true
        }

        System.out.println("-------------------------");

        // Clearing the Element

        hashSet.clear();
        System.out.println(STR."Clearing All the List From HashSet\{STR." \{hashSet.isEmpty()}"}");
        // Clearing All the List From HashSet true

        System.out.println("-------------------------");

    }
}
