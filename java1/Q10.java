class Q10 {

    public static void main(String[] args) {
        
        college1 c = new college1();

        Integer integer1 = new Integer(10);
        Integer integer2 = new Integer(20);

        c.stringOverload(5, 6);
        c.stringOverload("every", "one");
        c.stringOverload(1.2f, 2.8f);
        c.stringOverload(200.2344, 100.00000);
        c.stringOverload(integer1, integer2);
    }
}

class college1{

    void stringOverload(int i1, int i2){
        int m1=i1*i2;
        System.out.println("product of int " + i1 + " and " + i2 + " is : " + m1);
    }

    void stringOverload(float f1, float f2){
        float m2=f1*f2;
        System.out.println("product of float " + f1 + " and " + f2 + " is : " + m2);
    }

    void stringOverload(String a, String b){
        String c = "hello ";
        c = c.concat(a);
        System.out.println("concatenation of two strings is : " + c);

        c = c.concat(b);
        System.out.println("concatenation of three strings is : " + c);
    }

    void stringOverload(Integer x, Integer y){
        Integer z = x+y;
        System.out.println("Addition of two Integers : " + z);
    }

    void stringOverload(double d1, double d2){
        double d3 = d1+d2;
        System.out.println("Addition of two doubles : " + d3);
    }
}
