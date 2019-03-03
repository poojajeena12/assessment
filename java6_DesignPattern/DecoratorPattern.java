package java6_DesignPattern;

import java.util.Scanner;

interface Pizza{

    void PizzaType();
}
class CountrySpecial implements Pizza{

    @Override
    public void PizzaType() {
        System.out.println("CountrySpecial Pizza");
    }

    public int getCost(){
        return 300;
    }
}
class FarmHouse implements Pizza{

    @Override
    public void PizzaType() {
        System.out.println("FarmHouse Pizza");
    }
    public int getCost(){
        return 280;
    }
}

class Margherita implements Pizza{

    @Override
    public void PizzaType() {
        System.out.println("Margherita Pizza");
    }
    public int getCost(){
        return 320;
    }
}

class PizzaToping{
    public int Onion(){
        return 50;
    }
    public int Capsicum(){
        return 55;
    }
    public int Mushroom(){
        return 60;
    }
}

public class DecoratorPattern {
    public static void main(String[] args) {

        PizzaToping pizzaToping = new PizzaToping();
        FarmHouse farmHouse = new FarmHouse();
        farmHouse.PizzaType();

        System.out.println("Select topping : ");
        Scanner sc = new Scanner(System.in);
        String choice = sc.next();
        switch (choice){
            case "Onion":
                System.out.println("Cost of pizza with onion topping");
                System.out.println(farmHouse.getCost() + pizzaToping.Onion());
                break;
            case "Capsicum":
                System.out.println("Cost of pizza with capsicum topping");
                System.out.println(farmHouse.getCost() + pizzaToping.Capsicum());
                break;
            case "Mushroom":
                System.out.println("Cost of pizza with mushroom topping");
                System.out.println(farmHouse.getCost() + pizzaToping.Mushroom());
                break;
                default:
                    System.out.println("Not Valid");
                    break;
        }

    }
}
