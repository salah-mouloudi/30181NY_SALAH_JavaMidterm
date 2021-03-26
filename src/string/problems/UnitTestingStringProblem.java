package string.problems;



public class UnitTestingStringProblem {

    public static void main(String[] args) {
        // Unit testing for all classes within this package should be implemented here
        String s="abc";
        Permutation.permutations(s.toCharArray(),0);
        string.problems.Anagram a=new string.problems.Anagram();
        System.out.println( a.isAnnagram("cat","act"));
        DuplicateWord.repeatedWord("Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language");
    }
}
