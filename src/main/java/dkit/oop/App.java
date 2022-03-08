package dkit.oop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * LinkedHashSet  - maintains chronological order and prevents duplicates
 */
public class App {
    public static void main(String[] args) {
        System.out.println("LinkedHashSet");
        App app = new App();
        app.start();
    }


    public void start() {
        arrayListToLinkedHashSet();
    }

    // defining the method
    public void arrayListToLinkedHashSet() {

        // initializing the ArrayList
        ArrayList<String> arrayList = new ArrayList<>();

        // adding values in the ArrayList

        arrayList.add("Geeks");
        arrayList.add("For");
        arrayList.add("Geeks");


        // printing the list
        System.out.println("The array list : " + arrayList);

        // initializing the LinkedHashSet class
        // passing the ArrayList as parameter
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(arrayList);

        // printing the LinkedHashSet
        System.out.println("The converted "
                + "Linked Hash Set : "
                + linkedHashSet);

        boolean flag = linkedHashSet.contains("For");
        if( flag )
            System.out.println("True, it is present");
        else
            System.out.println("False, it is not present.");

        for (String str: linkedHashSet  ) {
            System.out.println(str);

        }

        Iterator iterator = linkedHashSet.iterator();

        while(iterator.hasNext()) {
            String name = (String)iterator.next();
            //Object name = iterator.next();
            System.out.println(name + ", ");

        }


    }


}


