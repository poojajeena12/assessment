package java2;
import java.util.Scanner;

class CustomException extends Exception{
    void CustomException(){
        System.out.println("custom exception generated");
    }
}
public class q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter person's details");
        System.out.println("enter name");
        String name = sc.next();
        try {
            System.out.println("enter age");
            int age = sc.nextInt();
            if (age < 20 || age > 30){
                throw new CustomException();
        }
            else{ System.out.println("success");}
        }catch (CustomException e) {
            System.out.println(e + " *this age is not applicable*");
        }
    }
}
