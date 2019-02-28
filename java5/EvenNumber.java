package java5;

import java.util.Arrays;
import java.util.List;


// question 9: Collect all the even numbers from an integer list.

public class EvenNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,4,9,8,7,15,12,64,55);

        System.out.println("Even numbers : ");
        list
                .stream()
                .filter(e->e%2==0)
                .forEach(System.out::println);
    }
}
