package java5;

//Question 6 : Create and access default and static method of an interface.

interface MyInterface{
    default void method1(){
        System.out.println("Default method in interface");
    }
    static void method2(){
        System.out.println("Static method in interface");
    }
}

public class DefaultStaticMethod implements MyInterface{
    public static void main(String[] args) {

        DefaultStaticMethod defaultStaticMethod = new DefaultStaticMethod();
        defaultStaticMethod.method1();
        MyInterface.method2();
    }
}
