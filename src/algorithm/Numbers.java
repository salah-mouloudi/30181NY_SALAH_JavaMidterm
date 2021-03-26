package algorithm;

import java.util.List;
import java.util.Random;

import databases.ConnectToSqlDB;

public class Numbers {

    /*
     * Show all the different kind of sorting algorithm by applying into (num array).
     * Display the execution time for each sorting.Example in below.
     *
     * Use any databases[MongoDB, Oracle or MySql] to store data and retrieve data.
     *
     * At the end. After running all the sorting algo, come to a conclusion which one is suitable on given data set.
     *
     */

    public static void main(String[] args) throws Exception {

        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

        int[] num = new int[100];
        storeRandomNumbers(num);

        // Selection Sort
        Sort algo = new Sort();
        algo.selectionSort(num);
        long selectionSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Selection Sort took: "
                + selectionSortExecutionTime + " milliseconds");

        connectToSqlDB.insertDataFromArrayToSqlTable(num, "selection_sort", "SortingNumbers");
        List<String> numbers = connectToSqlDB.readDataBase("selection_sort", "SortingNumbers");
        printValue(numbers);

        int n = num.length;
        randomize(num, n);


        algo.insertionSort(num);
        long insertionSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort took: "
                + insertionSortExecutionTime + " milliseconds");

        /*
         By following the same convention we used for Selection Sort, continue to do the same for all remaining sorting
            algorithms
         */
        /*
        Can you come to conclusion about which sorting algorithm is most efficient, given the size of the data set?
         */
//**************************************************************************************************************

        //BubbleSort
        algo.bubbleSort(num);
        long  bubbleSortExecutionTime= algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort took: "
                + bubbleSortExecutionTime + " milliseconds");
        connectToSqlDB.insertDataFromArrayToSqlTable(num, "bubble_sort", "SortingNumbers");
        List<String> num1 = connectToSqlDB.readDataBase("bubble_sort", "SortingNumbers");
        printValue(num1);

        //BucketSort
        randomize(num, num.length);
        algo.bucketSort(num, 100);
        long  bucketSortExecutionTime= algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort took: "
                + bucketSortExecutionTime + " milliseconds");
        connectToSqlDB.insertDataFromArrayToSqlTable(num, "bucket_sort", "SortingNumbers");
        List<String> num2 = connectToSqlDB.readDataBase("bucket_sort", "SortingNumbers");
        printValue(num2);

        //Heap Sort
        algo.heapSort(num);
        long heapSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Heap Sort take: " + heapSortExecutionTime + " milli sec");
        connectToSqlDB.insertDataFromArrayToSqlTable(num, "heap_sort", "SortingNumbers");
        List<String> num3 = connectToSqlDB.readDataBase("heap_sort", "SortingNumbers");
        printValue(numbers);
        randomize(num, num.length);

        //merge Sort
        algo.mergeSort(num);
        long mergeSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in merge Sort take: " + mergeSortExecutionTime + " milli sec");
        connectToSqlDB.insertDataFromArrayToSqlTable(num, "merge_sort", "SortingNumbers");
        List<String> num4 = connectToSqlDB.readDataBase("merge_sort", "SortingNumbers");
        printValue(num4);
        randomize(num, num.length);
    }

    /*
    HELPER METHODS
     */

    public static void storeRandomNumbers(int[] num) {
        Random rand = new Random();
        for (int i = 0; i < num.length; i++) {
            num[i] = rand.nextInt(1000000);
        }
    }

    public static void randomize(int[] arr, int n) {
        Random r = new Random();
        // Start from the last element and swap one by one. We don't
        // need to run for the first element that's why i > 0
        for (int i = n - 1; i > 0; i--) {
            int j = r.nextInt(i);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void printValue(List<String> array) {
        for (String st : array) {
            System.out.println(st);
        }
    }
}
