package java2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter int value of n : ");
        try{

            int n=sc.nextInt();
            int c = n/0;

        }catch (InputMismatchException e1){
            System.out.println(e1);
            System.out.println("input mismatch");
        }catch (ArithmeticException e2){
            System.out.println(e2);
        }
        finally {
            System.out.println("finally block executed!");
        }
    }
}
