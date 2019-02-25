package java3;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Question 3

public class SingleThreadExecutor {
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
                        Thread.sleep(500);
                        System.out.println("thread2");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }catch (Exception e){
            System.out.println(e);
        }
            es.shutdown();
        System.out.println(es.isShutdown());
    }
}

