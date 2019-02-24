package java3;

class q1 extends Thread{
    public static void main(String[] args) {
        q1 thread = new q1();
        thread.start();
    }
    public void run(){
        System.out.println("thread running ");
    }
}

//public class q1 implements Runnable{
//    public static void main(String[] args) {
//
//        Thread t = new Thread(new q1());
//        t.start();
//    }
//
//    @Override
//    public void run() {
//        System.out.println("thread running");
//    }
//}
