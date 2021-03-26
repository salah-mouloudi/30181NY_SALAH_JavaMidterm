package string.problems;

import java.util.Scanner;

public class Palindrome {
    public static boolean checkIfpalindrom(char[] word){
        int i = 0;
        int j = word.length - 1;
        while (j > i) {
            if (word[i] != word[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    //method 2
    public static void palindrome() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word");
        String st1 = input.nextLine();
        String temp = st1;
        String reverse = "";
        reverse = new StringBuilder(st1).reverse().toString();
        if (reverse.equals(st1)) {
            System.out.println(st1 + " is a palindrome");
        } else {
            System.out.println(st1 + " is not a palindrome");
        }
    }
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called a palindrome.
            Example: MOM, DAD, MADAM are palindromes.

            Write a method to check if a given String is a palindrome or not.
         */
        palindrome();
        String ss="dad";
        System.out.println(checkIfpalindrom(ss.toCharArray()));
    }
}

