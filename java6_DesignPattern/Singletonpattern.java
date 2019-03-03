package java6_DesignPattern;

class Singleton{
    static Singleton singleton;
    int value=1000;
    private Singleton(){
        System.out.println("Value is " + value);
    }
    static Singleton getInstance(){
        if (singleton==null){
            singleton = new Singleton();
        }
        return singleton;
    }
}

public class Singletonpattern {
    public static void main(String[] args) {

        Singleton.getInstance();
    }
}
