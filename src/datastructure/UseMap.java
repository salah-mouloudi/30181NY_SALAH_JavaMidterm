package datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UseMap {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Map that includes storing and retrieving elements.
         * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
         * Use For-Each loop and While-loop with Iterator to retrieve data.
         *
         * Store and retrieve data from/to a database table.
         */

        HashMap<String, Integer> studentID = new HashMap<>();

        studentID.put("MD", 5671);
        studentID.put("VA", 6543);
        studentID.put("NY", 2390);
        studentID.put("KS", 9048);

        System.out.println(studentID.containsKey("MD"));
        System.out.println(studentID.containsKey("VA"));
        System.out.println(studentID.containsKey(5671));

        System.out.println("***********************************************************************");

        HashMap<String, Integer> subjectID = new HashMap<>();
        subjectID.put("Java", 345);
        subjectID.put("ALM", 897);
        subjectID.put("SQL", 453);

        System.out.println(subjectID.containsKey("Java"));
        System.out.println(subjectID.containsKey("ALM"));
        System.out.println(subjectID.containsKey("SQL"));
        System.out.println(subjectID.containsKey(345));
        System.out.println(subjectID.containsKey(897));
        System.out.println(subjectID.containsKey(453));

        System.out.println("***********************************************************************");

        HashMap<String, HashMap<String, Integer>> map = new HashMap();
        map.put("Students IDs", studentID);
        map.put("  Courses", subjectID);
        System.out.println(map);

        System.out.println("***********************************************************************");

        ArrayList<HashMap<String, Integer>> list = new ArrayList<>();
        list.add(studentID);
        list.add(subjectID);
        System.out.println(list);

        System.out.println("***********************************************************************");

        List<String> semester = new ArrayList<>();
        semester.add("Fall");
        semester.add("Spring");
        semester.add("Winter");
        semester.add("Summer");

        System.out.println("Semesters: " + list);

        System.out.println("***********************************************************************");

        List<String> totalCredits = new ArrayList<>();
        totalCredits.add("Fifteen");
        totalCredits.add("Thirteen");
        totalCredits.add("Ten");
        totalCredits.add("Sixteen");

        System.out.println("Total Credits: " + totalCredits);


        List<String> totalCreditPerSemester = new ArrayList<>();
        totalCreditPerSemester.add("Total Credits");
        totalCreditPerSemester.add("Total Semesters");

        System.out.println("***********************************************************************");


        Map<String, List<String>> all = new HashMap<>();
        all.put("Credits that students can take per semester: ", totalCredits);
        all.put("Academic Semesters: ", semester);

        System.out.println(all);

        System.out.println("***********************************************************************");







    }

}
