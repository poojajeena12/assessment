package java6_DesignPattern;

interface Color{
    String ColorName();
}

interface Shape{
    String ShapeName();
}

class ShapeType implements Shape{

    String s_type;
    public ShapeType(String type){
        this.s_type=type;
    }

    @Override
    public String ShapeName() {
        return s_type;
    }
}

class ColorType implements Color{
    ShapeType shapeType;
    String c_type;
    String shape;
    public ColorType(ShapeType shapeType,String type){

        this.shape=shapeType.s_type;
        this.c_type=type;
    }

    @Override
    public String ColorName() {
        return c_type+ shape ;
    }
}
public class BridgePattern {
    public static void main(String[] args) {

        ShapeType shapeType = new ShapeType("Square");
        ColorType colorType = new ColorType(shapeType ,"Blue");

        ShapeType shapeType1 = new ShapeType("Square");
        ColorType colorType1 = new ColorType(shapeType1 ,"Red");

        ShapeType shapeType2 = new ShapeType("Triangle");
        ColorType colorType2 = new ColorType(shapeType1 ,"Pink");

        System.out.println(colorType.ColorName());
        System.out.println(colorType1.ColorName());
        System.out.println(colorType2.ColorName());
    }
}
