package java5;

//ques 1.4
interface UpperString{
    String upperCaseString(String str);
}

//ques1.3
//interface ConcatString{
//    String concatValue(String a, String b);
//}

//ques 1.2
//interface IncrementInt{
//    int increment(int a);
//}

// //ques 1.1
//interface CompareValue{
//    boolean compare(int a , int b);
//}
public class LambdaImplementation {
    public static void main(String[] args) {

        //ques 1.4
        UpperString upperString = (str) -> { return str.toUpperCase();};
        System.out.println(upperString.upperCaseString("hello world"));

        //ques 1.3
//        ConcatString concatString = (a,b) -> {return a+b;};
//        System.out.println(concatString.concatValue("hello ", "world"));

        //ques 1.2
//        IncrementInt incrementInt = (a) ->{ return a+1;};
//        System.out.println(incrementInt.increment(8));


        //ques 1.1
//        CompareValue compareValue = (a, b) -> {
//            if(a > b)
//                return true;
//            else
//                return false;
//        };
//        System.out.println(compareValue.compare(14,8));
    }
}
