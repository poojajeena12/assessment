package java6_DesignPattern;

class Student{

    private String name;
    private int age;
    private int id;
    private long phone_no;
    private String college;
    private String branch;
    private String state;
    private String country;

    public Student(StudentBuilder studentBuilder) {

        name=studentBuilder.getName();
        id =studentBuilder.getId();
        age=studentBuilder.getAge();
        phone_no=studentBuilder.getPhone_no();
        college=studentBuilder.getCollege();
        branch=studentBuilder.getBranch();
        state=studentBuilder.getState();
        country=studentBuilder.getCountry();
    }
    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(long phone_no) { this.phone_no = phone_no; }

    public String getCollege() { return college;}

    public void setCollege(String college) { this.college = college; }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getState() { return state; }

    public void setState(String state) {
        state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) { country = country;    }

    public String toString(){
        return " Name : " + name
                + "\n Id : " + id
                + "\n age : " + age
                + "\n phone_no : " + phone_no
                + "\n college : " + college
                + "\n branch : " + branch
                + "\n state : "  + state
                + "\n country : " + country;
    }
}
class StudentBuilder{

    private String name;
    private int id;
    private int age;
    private long phone_no;
    private String college;
    private String branch;
    private String State;
    private String Country;
    public StudentBuilder(String name, int id) {
        this.name=name;
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }
    public int getId(){return id;}

    public StudentBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public int getAge() {
        return age;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }


    public long getPhone_no() {
        return phone_no;
    }

    public StudentBuilder setPhone_no(long phone_no) {
        this.phone_no = phone_no;
        return this;
    }

    public String getCollege() {
        return college;
    }

    public StudentBuilder setCollege(String college) {
        this.college = college;
        return this;
    }

    public String getBranch() {
        return branch;
    }

    public StudentBuilder setBranch(String branch) {
        this.branch = branch;
        return this;
    }

    public String getState() {
        return State;
    }

    public StudentBuilder setState(String state) {
        State = state;
        return this;
    }

    public String getCountry() {
        return Country;
    }

    public StudentBuilder setCountry(String country) {
        Country = country;
        return this;
    }
    public Student build(){
        return new Student(this);
    }
}
public class BuilderPattern {
    public static void main(String[] args) {

        Student student = new StudentBuilder("Prashi",1024)
                .setAge(20)
                .setPhone_no(99885577)
                .setBranch("IT")
                .setCollege("ABES EC")
                .setCountry("India")
                .setState("UP")
                .build();
        System.out.println(student);
    }
}
