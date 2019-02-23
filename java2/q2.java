package java2;
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String string = sc.next();
        String[] array = string.split("");
        int n = array.length;
        String temp;
        for (int i=0; i<n-1; i++)
        {
            for (int j=0; j<n-i-1; j++)
            {
                if (array[j].compareTo(array[j+1])>0)
                {
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        System.out.println("after sorting");
        for (int i=0; i<n; i++)
        {
            System.out.print(array[i]);
        }
    }
}
