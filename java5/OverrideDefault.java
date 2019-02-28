package java5;

//Question 7 :  Override the default method of the interface.

interface DefaultInterface{
    default void Display(){
        System.out.println("default method inside interface");
    }
}
public class OverrideDefault implements DefaultInterface {
    public void Display(){
        System.out.println("Default method overriden");
}
    public static void main(String[] args) {
        OverrideDefault or = new OverrideDefault();
        or.Display();
    }
}
