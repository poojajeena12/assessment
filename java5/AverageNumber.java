package java5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//Question 11: Find average of the number inside integer list after doubling it.

public class AverageNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,4,8,2,9,7);
        System.out.println(" Average = " +
                list.stream()
                        .map(e->e*2)
                        .collect(Collectors.averagingInt(e->e))
        );
    }
}
