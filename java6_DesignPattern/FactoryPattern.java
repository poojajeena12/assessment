package java6_DesignPattern;

import java.util.Scanner;

interface Polygon{
    void ShapeType();
}

class Triangle implements Polygon{

    @Override
    public void ShapeType() {
        System.out.println("Triangle with 3 sides");
    }
}
class Square implements Polygon{

    @Override
    public void ShapeType() {
        System.out.println("Square with 4 sides");
    }
}
class Pentagon implements Polygon{

    @Override
    public void ShapeType() {
        System.out.println("Pentagon with 5 sides");
    }
}

class PolygonFactory{

    public void getPolygon(String choice) {
        switch (choice){
            case "Triangle":
                new Triangle().ShapeType();
                break;
            case "Square":
                new Square().ShapeType();
                break;
            case "Pentagon":
                new Pentagon().ShapeType();
                break;
        }
    }
}
public class FactoryPattern {
    public static void main(String[] args) {

        PolygonFactory polygonFactory = new PolygonFactory();
        System.out.println("Enter your choice : ");
        Scanner sc = new Scanner(System.in);
        String choice = sc.next();
        polygonFactory.getPolygon(choice);
    }
}
