package datastructure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DataReader {

    public static void main(String[] args) {
        /*
         * Create an API to read the below textFile and print it to the console.
         *      HINT: Use BufferedReader class
         * Use try-catch block to handle Exceptions
         *
         * Store and retrieve the file to/from a database table.
         *
         * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
         * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
         * order from LinkedList and retrieve as FILO order from Stack.
         *
         * Demonstrate how to use Stack using push, peek, search & pop methods.
         * Use For-Each & While-loop with Iterator to retrieve data.
         */

//        String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";

        try(FileReader fr = new FileReader("src/data/self-driving-car")) {

            BufferedReader bf = new BufferedReader(fr);
            int i;
            while ((i = bf.read()) != -1)
                System.out.print((char) i);
            bf.close();
        }catch (IOException e){
            e.printStackTrace();
            System.out.println("File not found!");

        }

    }

}
