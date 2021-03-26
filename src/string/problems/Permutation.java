package string.problems;

public class Permutation {
    public static void swap(char[] ch, int i, int j)
    {
        char value = ch[i];
        ch[i] = ch[j];
        ch[j] = value;
    }
    public static void permutations(char[] word, int index)
    {
        if (index == word.length - 1) {
            System.out.println(String.valueOf(word));
        }
        for (int i = index; i < word.length; i++)
        {
            swap(word, index, i);
            permutations(word, index + 1);
            swap(word, index, i);
        }
    }

    public static void main(String[] args) {

        /*
        Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".

        Write Java program to compute all permutations of any given String
         */
        String s="abc";
        permutations(s.toCharArray(),0);
    }}