package java5;

import java.util.Arrays;
import java.util.List;

//question 12 : Find the first even number in the integer list which is greater than 3.

public class FirstEven {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,6,7,5,12,8,95,24,14,15);
        System.out.println("first even number = " +
                list.stream()
                        .filter(e->e>3)
                        .filter(e->e%2==0)
                        .findFirst());
    }
}
