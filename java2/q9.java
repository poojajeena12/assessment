package java2;

import java.util.Scanner;

interface furniture{

    abstract void firetest();
    abstract void stresstest();
}
class wooden_chair implements furniture{

    @Override
    public void firetest() {
        System.out.println("firetest failed for wooden chair");
    }

    @Override
    public void stresstest() {
        System.out.println("firetest failed for wooden chair");
    }
}
class wooden_table implements furniture{

    @Override
    public void firetest() {
        System.out.println("firetest failed for wooden table");
    }

    @Override
    public void stresstest() {
        System.out.println("stresstest failed for wooden table");
    }
}
class metal_chair implements furniture {
    @Override
    public void firetest() {
        System.out.println("firetest passed for metal chair");
    }

    @Override
    public void stresstest() {
        System.out.println("stresstest passed for metal chair");
    }
}

class metal_table implements furniture{

    @Override
    public void firetest() {
        System.out.println("firetest passed for metal table");
    }

    @Override
    public void stresstest() {
        System.out.println("stresstest passed for metal table");
    }
}
public class q9 {
    public static void main(String[] args) {
        wooden_chair wc = new wooden_chair();
        wooden_table wt = new wooden_table();
        metal_chair mc = new metal_chair();
        metal_table mt = new metal_table();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choice");
        System.out.println("1 for wooden chair");
        System.out.println("2 for wooden table");
        System.out.println("3 for metal chair");
        System.out.println("4 for metal table");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                wc.firetest();
                wc.stresstest();
                break;
            case 2:
                wt.firetest();
                wt.stresstest();
                break;
            case 3:
                mc.firetest();
                mc.stresstest();
                break;
            case 4:
                mt.firetest();
                mt.stresstest();
                break;
        }
    }
}
