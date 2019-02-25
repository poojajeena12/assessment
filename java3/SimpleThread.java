//package java3;
//
//public class SimpleThread {
//
//    static int counter = 0;
//
//    public static void main(String[] args) throws InterruptedException {
//        Thread thread1 = new Thread(new SimpleThread() {
//            @Override
//            public void run() {
//                try {
//                    Thread.sleep(2000);
//                    System.out.println("Running 1st Thread");
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//        Thread thread2 = new Thread(new SimpleThread() {
//            @Override
//            public void run() {
//                try {
//                    Thread.sleep(5000);
//                    System.out.println("Running 2nd Thread");
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//        Thread thread3 = new Thread();
//
//        thread1.start();
//        thread2.start();
//        //thread1.join();
//
//        thread2.join();
//
//    }
//}
