package math.problems;

import java.util.Arrays;

public class FindLowestDifference {

    static int lowestDifference(int array1[], int array2[], int m, int n){

        Arrays.sort(array1);
        Arrays.sort(array2);

        int a = 0;
        int b = 0;

        int result = Integer.MAX_VALUE;

        while (a < m && b < n){

            if (Math.abs(array1[a] - array2[b]) < result)
                result = Math.abs(array1[a] - array2[b]);

            if (array1[a] < array2[b])
                a++;
            else
                b++;
        }
        return result;
    }




    public static void main(String[] args) {
        /*
         Write a method to return the the lowest difference between these two arrays
            HINT: The lowest difference between these arrays is 1
        */

        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};

        int m = array1.length;
        int n = array2.length;

        System.out.println(lowestDifference(array1,array2,m,n));

    }

}
