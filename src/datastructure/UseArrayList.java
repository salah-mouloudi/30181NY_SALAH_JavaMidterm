package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use ArrayList that includes using the add, peek, remove & retrieve methods.
         * Use For-Each loop and While-loop with Iterator to retrieve data.
         *
         * Store and retrieve data from/to a database table.
         */

        ArrayList<String> list = new ArrayList<>();

        // add to array list

        list.add("Supernatural");
        list.add("Cobra kai");
        list.add("Friends");
        list.add("Crash Landing on you");
        list.add("Itaewon Class");
        list.add("The 100");

        System.out.println("*******************************************************************************************");

        System.out.println("\nList of Favourite shows: " + list);

        System.out.println("*******************************************************************************************");

        Iterator<String> iter = list.iterator();

        System.out.println("\nThe iterator values" + " of list are : ");
        {
        }

        while (iter.hasNext()) {
            System.out.println(iter.next() + " ");
        }
        String arr[] = {" ", " Show ratings: Rating 9+ "};
        for (String str : arr) {
            System.out.println(str);
        }

        System.out.println("*******************************************************************************************");

        //remove from the list

        list.remove("Supernatural");
        System.out.println();
        System.out.println("\nDisplaying Rest of the items in the list: " + list);

        System.out.println("*******************************************************************************************");

        // to display any item on the list
        System.out.println("\nItem in the Index 4 is: " + list.get(4));

        System.out.println("*******************************************************************************************");

        //List Size
        System.out.println("\nSize of the array list: " + list.size());








    }
}
