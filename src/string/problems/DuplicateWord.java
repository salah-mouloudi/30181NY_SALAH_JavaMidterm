package string.problems;

public class DuplicateWord {
    public static void repeatedWord(String sentence) {
        String[] word = sentence.split(" ");
        int count = 1;
        for (int i = 0; i < word.length; i++) {
            for (int j = i + 1; j < word.length; j++) {
                if (word[i].equals(word[j])) {
                    count = count + 1;
                }
                word[j] = "0";
            }
            if (word[i] != "0") {
                System.out.println(word[i] + " is repeated " + count + " times");
                count = 1;
            }

        }
    }
    public static void main(String[] args) {

        /*
         Write a java program to find the duplicate words and their number of occurrences in the string.
            Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        repeatedWord(st);

    }}
