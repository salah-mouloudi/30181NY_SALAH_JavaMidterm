package math.problems;

public class Factorial {

    /*
     Write a method to return the Factorial of any given number using Recursion as well as Iteration

     Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120
     */

    public static void main(String[] args) {
        int f = 5;
        System.out.println("\nFactorial of " +f+ " is " + factorial(f));
    }
    public static int factorial(int f){
        int facNum = 1;

        for (int i = 1; i <= f; i++){
            facNum = facNum * i;
        }
        return facNum;
    }


}
