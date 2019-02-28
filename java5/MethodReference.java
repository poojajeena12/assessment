package java5;

//Question 3: Using (instance) Method reference create and apply add and subtract method and using (Static)
// Method reference create and apply multiplication method for the functional interface created.

interface MethodInterface{
    void method(int a, int b);
}

//Question 2: Create a functional interface whose method takes 2 integers and return one integer.
//interface TwoInteger{
//    int values(int a, int b);
//}

public class MethodReference {

     void add(int a, int b){
        System.out.println("Addition = " + (a+b));
    }
     void subtract(int a,int b){
        System.out.println("subtraction = " + (a-b));
    }
    static void multiply(int a, int b){
        System.out.println("product = " + a*b);
    }
    public static void main(String[] args) {
//
//        TwoInteger twoInteger = (a,b) -> {return a+b;};
//        System.out.println("Single integer as sum = " + twoInteger.values(5,9));
//
         MethodInterface methodInterface = new MethodReference()::add;
         MethodInterface methodInterface1 = new MethodReference()::subtract;
         MethodInterface methodInterface2 = MethodReference::multiply;

         methodInterface.method(8,5);
         methodInterface1.method(8,5);
         methodInterface2.method(8,5);


    }
}
