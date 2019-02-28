package java5;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

//Question 5: Implement following functional interfaces from java.util.function using lambdas:
//        (1) Consumer
//        (2) Supplier
//        (3) Predicate
//        (4) Function

public class FunctionInterface_q5 {
    public static void main(String[] args) {

        Consumer consumer = (a) -> { System.out.println("Consumer : " + a); };

        Supplier supplier = () -> "consumer return";

        Predicate<Integer> predicate = (a) -> { return a % 4 == 0; };

        Function<Integer,Integer> function = a-> { return a*a; };

        consumer.accept(256);
        System.out.println("supplier : " + supplier.get());
        System.out.println("predicate : " + predicate.test(12));

        System.out.println("function :  Square of number = " + function.apply(5));
    }
}
