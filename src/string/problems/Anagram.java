package string.problems;


import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".


        isAnnagram("Cat", "Act");
        isAnnagram("Cat", "FAT");

    }

    public static boolean isAnnagram(String a, String b) {
        boolean status = true;

        if (a.length() != b.length()) {
            status = false;
        } else {
            char[] arrayS1 = a.toLowerCase().toCharArray();
            char[] arrayS2 = b.toLowerCase().toCharArray();
            Arrays.sort(arrayS1);
            Arrays.sort(arrayS2);
            status = Arrays.equals(arrayS1, arrayS2);
        }
        System.out.println(a + " " + b + " " + status);

        return status;

    }




}

