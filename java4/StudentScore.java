package java4;

import java.util.*;

//question 5 Write a program to sort the Student objects based on Score , if the score are same then sort on First Name .
// Class Student{ String Name; Double Score; Double Age

class student {

    String name;
    double age;
    double score;

    student(String name1, double age1, double score1) {
        this.name = name1;
        this.age = age1;
        this.score = score1;
    }

    public String getName() {
        return name;
    }
}

    class compare_result implements Comparator<student> {

        @Override
        public int compare(student o1, student o2) {
            if (o1.score > o2.score) {
                return 1;
            } else if (o1.score == o2.score) {
                return o1.getName().compareTo(o2.getName());

            } else
                return -1;
        }
    }
public class StudentScore {
    public static void main(String[] args) {

        compare_result c = new compare_result();
        student s = new student("kian", 20, 80);
        student s1 = new student("dharvi", 25, 70);
        student s2 = new student("prashi", 23, 80);
        student s3 = new student("tanmay", 19, 89);
        student s4 = new student("tanisha", 28, 90);
        student s5 = new student("dhairya", 30, 75);

        List<student> list = new ArrayList<student>();
        list.add(s);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        list.sort(c);

        Iterator<student> iterator = list.listIterator();
        while(iterator.hasNext()){
            student st = (student)iterator.next();
            System.out.println("Name = " + st.name + ", age = " + st.age + " ,  score =  " + st.score);
        }
    }
}
