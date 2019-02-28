package java5;

// question 8 : Implement multiple inheritance with default method inside  interface.

interface MyInterface1{
    default void display(){
        System.out.println("display in interface 1");
    }
}
interface MyInterface2{
    default void play(){
        System.out.println("play in interface 2");
    }
}
public class MultipleInheritence implements MyInterface1, MyInterface2 {
    public static void main(String[] args) {

        MultipleInheritence multipleInheritence = new MultipleInheritence();
        multipleInheritence.display();
        multipleInheritence.play();
        }
    }
