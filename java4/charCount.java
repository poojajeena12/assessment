package java4;

//question 3. Write a method that takes a string and print the number of occurrence of each character characters in the string.

import java.util.*;

public class charCount {
    public static void main(String[] args) {
        String s = "HelloWorld";
        List<String> list = Arrays.asList(s.split(""));
        Set<String> se = new HashSet<String>(list);
        Iterator i = se.iterator();
        while(i.hasNext()){
            String c = (String) i.next();
            int temp= (int) Collections.frequency(list,c);
            System.out.println("Character " + c + " count " + temp);
        }
    }

}
