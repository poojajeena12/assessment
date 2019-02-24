package java4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List arrayList = new ArrayList();
        System.out.println("enter float values : ");
        for (int i=0;i<5;i++) {
            float f = sc.nextFloat();
            arrayList.add(f);
        }
        float sum = 0;
        Iterator iterator = arrayList.iterator();

        while (iterator.hasNext()){
            sum += (float)iterator.next();
        }
        System.out.println("sum of values : " + sum);
    }
}
