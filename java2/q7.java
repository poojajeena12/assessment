package java2;

import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter seconds");
        long n = sc.nextLong();
        int day = (int)n/(60*60*24);
        int rem_sec=(int)n%(60*60*24);
        int hour = rem_sec/(60*60);
        int rem_sec1 = rem_sec%(60*60);
        int min = rem_sec1/60;
        int rem_sec2 = rem_sec1%60;

        System.out.println(day + " day " + hour + " hours " + min + " minutes " + rem_sec2 + " seconds ");
    }
}
