package java2;
interface library{
    abstract void issue_book(int book_id, String name, int s_id);
    abstract void return_book(int book_id);
}
class student implements library{
    int book_id;
    String name;
    int s_id;
    @Override
    public void issue_book(int book_id, String name, int s_id) {
        this.book_id=book_id;
        this.name=name;
        this.s_id=s_id;
    }
    @Override
    public void return_book(int book_id) {
        this.book_id=book_id;
    }
}
public class q1 {
    public static void main(String[] args) {
        student s = new student();
        s.issue_book(1202, "pooja", 101);
        System.out.println("Book number: " + s.book_id + " issued to student_ID= " + s.s_id + ", name *" + s.name + "*");
        s.issue_book(35024, "mona", 214);
        System.out.println("Book number: " + s.book_id + " issued to student_ID= " + s.s_id + ", name *" + s.name + "*");
        s.return_book(1202);
        System.out.println("Book number: " + s.book_id + " returned.");
    }
}
