package Collection;

import java.util.*;

import static java.lang.StringTemplate.STR;

public class arrayList {

    public static void main(String[] args) {

        ArrayList myList = new ArrayList();

        List myList1 = new ArrayList();

        ArrayList<Integer> myIntList = new ArrayList<>();

        // Adding the Data into ArrayList
        myList.add(100);
        myList.add(100.50);
        myList.add("Java");
        myList.add("S");
        myList.add(true);
        myList.add(100);
        myList.add(null);
        myList.add(null);

        // Size of ArrayList
        myList.size();
        System.out.println(STR."Size of ArrayList\{STR." \{myList.size()}"}");

        System.out.println("-------------------------");

        // Printing ArrayList
        System.out.println(STR."Printing the Data of ArrayList\{myList}");
        // Printing the Data of ArrayList[100, 100.5, Java, S, true, 100, null, null

        System.out.println("-------------------------");

        // Removing the object/Element form ArrayList

        myList.remove(6); // 6 the index Value From myList

        System.out.println(STR."Printing the Data of ArrayList after Remove\{myList}");
        // Printing the Data of ArrayList after Remove[100, 100.5, Java, S, true, 100, null]

        System.out.println("-------------------------");

        // Adding the object/Element in the middle or anyWhere in the ArrayList

        myList.add(3, "Sangram");

        System.out.println(STR."Printing the Data Value add inBetween the ArrayList\{STR." \{myList}"}");
        // Printing the Data Value add inBetween the ArrayList [100, 100.5, Java, Sangram, S, true, 100, null]

        System.out.println("-------------------------");

        //Modification/Replace/Change of the ArrayList

        myList.set(2, "Selenium");
        System.out.println(STR."Printing the Data Value When Modification/Replace/Change the ArrayList\{STR." \{myList}"}");
        // Printing the Data Value When Modification/Replace/Change the ArrayList [100, 100.5, Selenium, Sangram, S, true, 100, null]

        System.out.println("-------------------------");

        // Getting the Specific Value of the ArrayList

        myList.get(4);

        System.out.println(STR."Printing the Data with Specific Value in the ArrayList\{STR." \{myList.get(3)}"}");
        // Printing the Data with Specific Value in the ArrayList Sangram

        System.out.println("-------------------------");

        // Printing the ArrayList with For Loop

        for (Object object : myList) {
            System.out.println(STR."Printing the Data with ForLoop\{STR." \{object}"}");
        }

        System.out.println("-------------------------");

        // Printing the ArrayList with ForEach Loop

        for (Object x : myList) {
            System.out.print(STR."Printing the Data with For Each loop \{x}");
            // Printing the Data with ForLoop 100
            // Printing the Data with ForLoop 100.5
            // Printing the Data with ForLoop Selenium
            // Printing the Data with ForLoop Sangram
            // Printing the Data with ForLoop S
            // Printing the Data with ForLoop true
            // Printing the Data with ForLoop 100
            // Printing the Data with ForLoop null
        }

        System.out.println("-------------------------");

        // Using the Iterator - When we Don't know how much data we have
        Iterator it = myList.iterator();

        while (it.hasNext()) {
            System.out.println(STR."Printing the Data with while Loop\{it.next()}");
            break;
        }

        System.out.println("-------------------------");

        // Checking if ArrayList is Empty or not

        System.out.println(STR."Checking Value of Array List If Empty or not \{myList.isEmpty()}");
        // Checking Value of Array List If Empty or not false

        System.out.println("-------------------------");

        // Removing the Element from MyList

        ArrayList myRemoveList = new ArrayList();

        myRemoveList.add(100);
        myRemoveList.add("Java");
        myRemoveList.add("S");
        myList.removeAll(myRemoveList);

        System.out.println(STR."Printing the Removed List\{myList}");
        // Printing the Removed List[100.5, Selenium, Sangram, true, null]

        System.out.println("-------------------------");

        // Removing All the Element from List

        myList.clear();

        System.out.println(STR."Clearing the all element from list\{STR." \{myList.isEmpty()}"}");
        //Clearing the all element from list true

        System.out.println("-------------------------");
    }
}
