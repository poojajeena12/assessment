package java4;

import java.util.*;

//question 2. Write a method that takes a string and returns the number of unique characters in the string.


public class uniqueChar {
    public static void main(String[] args) {
        String s = "Helloworld";
        List<String> list = Arrays.asList(s.split(""));
        System.out.println(" list of all    " + list);
        Set<String> set = new HashSet<String>(list);
        Iterator i = set.iterator();
        System.out.println(" list of uniques   " + set);
        int j = 0;
        while(i.hasNext()) {
            i.next();
            j = j+1;
        }
        System.out.println(" count of uniques  " + j);
    }
}
