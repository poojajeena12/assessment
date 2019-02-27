package java4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
//    4. Write a program to sort Employee objects based on highest salary using Comparator.
// Employee class{ Double Age; Double Salary; String Name

class employee{
    double salary;
    String name;
     double age;
    employee(String name1, double age1, double salary1){
        this.name=name1;
        this.age = age1;
        this.salary = salary1;
    }
}
class compare1 implements Comparator<employee>{

    @Override
    public int compare(employee o1, employee o2) {
        if (o1.salary > o2.salary)
        {
            return 1;
        }
        else{
            return -1;
        }
    }
}

public class highest_salary{
    public static void main(String[] args) {

        employee e = new employee("aa", 22, 10100);
        employee e1 = new employee("bb", 23, 20542);
        employee e2 = new employee("cc", 24, 54000);
        employee e3 = new employee("dd", 20, 40004);

        ArrayList<employee> emp_list = new ArrayList<employee>();
        compare1 c = new compare1();
        emp_list.add(e);
        emp_list.add(e1);
        emp_list.add(e2);
        emp_list.add(e3);
        emp_list.sort(c);
        Iterator i = emp_list.iterator();
        while(i.hasNext()){
            employee emp = (employee)i.next();
            System.out.println("Name = " + emp.name + ", age = " + emp.age + " ,  salary =  " +emp.salary);
        }

//        emp_list.add(101);
//        emp_list.add(102);
//        emp_list.add(103);
//        emp_list.add(104);

    }
}
