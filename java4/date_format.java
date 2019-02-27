package java4;

import java.text.SimpleDateFormat;
import java.util.Date;
//question 8. Write a program to format date as example "21-March-2016"

public class date_format {
    public static void main(String[] args) {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
        String dateformat = sdf.format(d);
        System.out.println(dateformat);
    }
}
