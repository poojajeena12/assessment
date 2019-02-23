package java2;

 class singleton {
    public String s;
    private static singleton ss = null;

    private singleton() {
        s = "singleton class string";
    }
    public static singleton getInstance() {
        if (ss == null) {
            ss = new singleton();
        }
        return ss;
    }
}
public class q4{

    public static void main(String[] args) {
     singleton a =singleton.getInstance();
        System.out.println(a.s);
    }
}
