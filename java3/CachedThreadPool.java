package java3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Question 9

class Process implements Runnable{
    int id;

    public Process(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Thread : " + Thread.currentThread().getName() + " " +id);
    }
}

public class CachedThreadPool {
    public static void main(String[] args) {

//        ExecutorService es= Executors.newFixedThreadPool(3);
        ExecutorService es= Executors.newCachedThreadPool();

        for (int i = 0; i < 10; i++) {
            es.submit(new Process(i));
        }
        es.shutdown();
    }
}
