package java6_DesignPattern;

interface StudentRecords{
    void display();
}

class Person{

    public String PersonType;

    public Person(String PersonType){
        this.PersonType=PersonType;
    }

    public String getPersonType() {
        return PersonType;
    }

    public void setPersonType(String personType) {
        PersonType = personType;
    }
}

class AccessPerson implements StudentRecords{

    Person person;

    public AccessPerson(Person person){
        this.person=person;
    }
    @Override
    public void display() {
        System.out.println("Access approved for Admin");
    }
}

class AccessPersonProxy extends AccessPerson{

    public AccessPersonProxy(Person person) {
        super(person);
    }

    @Override
    public void display() {
        if(person.PersonType=="Admin")
        super.display();
        else
            System.out.println("Access denied");
    }
}
public class ProxyPattern {
    public static void main(String[] args) {
        Person p = new Person("Student");
        StudentRecords studentRecords = new AccessPersonProxy(p);
        studentRecords.display();

        Person p1 = new Person("Admin");
        StudentRecords studentRecords1 = new AccessPersonProxy(p1);
        studentRecords1.display();
    }
}
