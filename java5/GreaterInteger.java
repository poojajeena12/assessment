package java5;

//Question 10: Sum all the numbers greater than 5 in the integer list.

import java.util.Arrays;
import java.util.List;

public class GreaterInteger {
    public static void main(String[] args) {
        List<Integer> list =Arrays.asList(2,65,41,3,7,2,0,5,6);
        System.out.println("Numbers greater than 5 are : ");
        list.stream()
                .filter(e->e>5)
                .forEach(System.out::println);
    }
}
