package java2;

class q5 implements Cloneable {

    String s1;
    public q5(String str) {
        this.s1 = str;
    }
    public static void main(String[] args) throws CloneNotSupportedException {
        q5 string1 = new q5("Hello world");
        q5 string2 = (q5) string1.clone();

        System.out.println(string2.s1);

        copyConstructor copy = new copyConstructor("copy");
        copyConstructor copy1 = new copyConstructor(copy);
    }
}
class copyConstructor {
    String str;

    public copyConstructor(String str1) {
        this.str = str1;
    }
    copyConstructor(copyConstructor cc) {
        str = cc.str;
        System.out.println("copy constructor");
    }
}
