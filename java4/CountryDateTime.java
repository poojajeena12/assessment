package java4;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

//question 9 : Write a program to display times in different country format.

public class CountryDateTime {
    public static void main(String[] args) {
        Date d = new Date();

        Locale l1 = new Locale("it");
        Locale l2 = new Locale("en");
        Locale l3 = new Locale("fr");
        Locale l4 = new Locale("de");


        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL,l1);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL,l2);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL,l3);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL,l4);

        System.out.println(df1.format(d));
        System.out.println(df2.format(d));
        System.out.println(df3.format(d));
        System.out.println(df4.format(d));
    }
}
