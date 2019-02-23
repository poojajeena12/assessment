package java2;
import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = "";
        System.out.println("enter string");
        do {
            string = sc.next();
            if (string.equals("done"))
            {
                System.out.println("done encountered!");
                break;
            }
            int n= string.length();
            if(string.charAt(0) == string.charAt(n-1))
            {
                System.out.println("first character is equal to its last character");
            }
            else
            {
                System.out.println("first character is not equal to its last character");
            }
        }while (!string.equals("done"));

    }
}
