package java6_DesignPattern;

interface EmployeeDepartment{
    void Directories();
}

class Developer implements EmployeeDepartment{
    public String name;
    public int e_id;

    public  Developer(String name, int e_id){
        this.name=name;
        this.e_id=e_id;
    }
    @Override
    public void Directories() {
        System.out.println("Developer's Detail : ");
        System.out.println("Name : " + name + "\nE_Id : " + e_id);
    }
}

class QA implements EmployeeDepartment{
    public String name;
    public int e_id;

    public QA(String name, int e_id){
        this.name=name;
        this.e_id=e_id;
    }
    @Override
    public void Directories() {
        System.out.println("QA's Detail : ");
        System.out.println("Name : " + name + "\nE_Id : " + e_id);
    }
}

class Manager implements EmployeeDepartment{
    public String name;
    public int e_id;

    public Manager(String name, int e_id){
        this.e_id=e_id;
        this.name=name;
    }
    @Override
    public void Directories() {
        System.out.println("Manager's Detail : ");
        System.out.println("Name : " + name + "\nE_Id : " + e_id);
    }
}
class Technical implements EmployeeDepartment{

    Developer developer;
    QA qa;
    public Technical(Developer developer){
        developer.Directories();
    }

    public Technical(QA qa){
        qa.Directories();
    }

    @Override
    public void Directories() {
        System.out.println("Technical directory\n");
    }
}
class HR implements EmployeeDepartment{

    Manager manager;

    public HR(Manager manager){
        manager.Directories();
    }
    @Override
    public void Directories() {

        System.out.println("HR directory\n");
    }
}

public class CompositePattern {
    public static void main(String[] args) {

        Developer developer = new Developer("Alex", 101);
        QA qa = new QA("Bob", 102);
        Manager manager = new Manager("David", 103);

        Technical technical = new Technical(developer);
        technical.Directories();

        Technical technical1 = new Technical(qa);
        technical1.Directories();

        HR hr = new HR(manager);
        hr.Directories();
    }
}
