package java5;
//Question 4 :Create an Employee Class with instance variables (String) name,
// (Integer)age, (String)city and get the instance of the Class using constructor reference

interface EmpInterface{
   Employee emp(String name, int age, String city);
}
class Employee{
    String name;
    int age;
    String city;
    Employee(String name1, int age1, String city1){
        this.name=name1;
        this.age=age1;
        this.city=city1;
        System.out.println("Name : " + name1 + " age : "+ age + " city : " + city);
    }

}
public class ConstructorReference {
    public static void main(String[] args) {
        EmpInterface e = Employee::new;
        Employee e1 = new Employee("Kian", 7, "Ghaziabad");
        Employee e2 = new Employee("Prashi", 12, "Kanpur");
        Employee e3 = new Employee("Tanmay", 20, "Delhi");

    }
}
