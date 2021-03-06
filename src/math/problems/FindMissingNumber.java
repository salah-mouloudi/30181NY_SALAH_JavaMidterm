package math.problems;

public class FindMissingNumber {

    static int getMissingNumber(int array[], int n){
        int i;
        int numbers;
        numbers = (n + 1) * (n + 2) / 2;
        for (i = 0; i <n; i++)
            numbers -= array[i];
        return numbers;
    }

    public static void main(String[] args) {
        /*
         If n = 10, then array will have 9 elements in the range from 1 to 10.
            For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).

         Write a method to find the missing number from the array.
         */
        int[] array = new int[] {10, 2, 1, 4, 5, 3, 7, 8, 6};
        int missingNumber = getMissingNumber(array, 9);
        System.out.println("The missing number: " + missingNumber);


    }
}
