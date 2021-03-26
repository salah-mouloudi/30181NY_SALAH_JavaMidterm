package math.problems;

public class Fibonacci {

    /*
    Write a method that will print or return at least 40 Fibonacci numbers

      0,1,1,2,3,5,8,13
     */

    public static void main(String[] args) {

        int Numbers = 40;
        int beforeNumber = 0;
        int nextNumber = 1;

        System.out.println("Fibonacci numbers of "+Numbers+ " are: ");
        for (int i = 1; i <= Numbers; i++){
            System.out.println(beforeNumber+"");

            int sum = beforeNumber + nextNumber;
            beforeNumber = nextNumber;
            nextNumber = sum;
        }




    }


}
