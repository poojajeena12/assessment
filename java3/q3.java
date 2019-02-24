package java3;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class q3 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService es = Executors.newSingleThreadExecutor();

        try {
            es.submit(new Runnable() {
                public void run() {
                    System.out.println("thread1");
                }
            });
            es.submit(new Runnable() {
                public void run() {
                    try {
                        Thread.sleep(800);
                        System.out.println("thread2");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }catch (Exception e){
            System.out.println(e);
        }finally {
            es.shutdown();
//            es.shutdownNow();
        }
        System.out.println(es.isShutdown());
    }
}


//    public static void main(String[] args) {
//        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        try {
//            executorService.submit(new Runnable() {
//                @Override
//                public void run() {
//                    System.out.println("Thread 1");
//                }
//            });
//
//            executorService.submit(new Runnable() {
//                @Override
//                public void run() {
//                    System.out.println("Thread 2");
//                }
//            });
//
//            executorService.submit(new Runnable() {
//                @Override
//                public void run() {
//                    try {
//                        Thread.sleep(3000L);
//                    } catch (InterruptedException e) {
//                    e.printStackTrace();
//                    }
//                    System.out.println("Thread 3");
//                }
//            });
//
//        } finally {
//            executorService.shutdownNow();
//        }
//
//        System.out.println(executorService.isShutdown());
//        System.out.println(executorService.isTerminated());
//        System.out.println("End");
//    }
//}
