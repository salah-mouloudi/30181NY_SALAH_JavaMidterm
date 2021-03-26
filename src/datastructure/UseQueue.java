package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Queue that includes add, peek, remove & poll elements.
         * Use For-Each loop and While-Loop with Iterator to retrieve data.
         *
         * Store and retrieve data from/to a database table.
         */

        Queue<String> colors = new LinkedList<>();

        colors.add("Orange");
        colors.add("Red");
        colors.add("Purple");
        colors.add("Yellow");

        System.out.println("The first queue is : " + colors);

        System.out.println("*******************************************************************************");

        Iterator<String> primeColors = colors.iterator();
        System.out.println("The queue after Iteration : ");
        {
        }
        while (primeColors.hasNext()) {
            System.out.println(primeColors.next());

        }

        System.out.println("*******************************************************************************");


        colors.poll();
        System.out.println("Queue after poll : "+colors);

        System.out.println("*******************************************************************************");

        colors.remove();
        System.out.println("Queue after remove : "+colors);

        System.out.println("*******************************************************************************");

        colors.peek();
        System.out.println("Peek method displays : "+colors.peek());

        System.out.println("*******************************************************************************");

        colors.element();
        System.out.println("Element method displays : "+colors.element());

        System.out.println("*******************************************************************************");
        System.out.println("Does the queue contain this color? "+colors.contains("Yellow"));
    }



}


