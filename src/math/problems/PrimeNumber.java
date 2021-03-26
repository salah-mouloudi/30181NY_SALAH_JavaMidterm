package math.problems;

public class PrimeNumber {

    public static void main(String[] args) {
        /*
        Write a method to print the list of prime numbers from 2 to 1,000,000
            Solving the problem should be your first priority, however bonus points if you can figure out how to
            improve algorithmic efficiency

         Print out the prime numbers in the given range.
         */

        int i =0;
        int num = 0;
        String primeNumbers = "";

        for (i = 1; i <= 1000000; i++){
            int count = 0;
            for (num = i; num >= 1; num--){
                if(i%num==0){
                    count = count + 1;
                }
            }

            if (count == 2){

                primeNumbers = primeNumbers +i+ ", ";

            }
        }

        System.out.println("Prime numbers from 2 to 1000000 are: ");
        System.out.println(primeNumbers);


    }

}
