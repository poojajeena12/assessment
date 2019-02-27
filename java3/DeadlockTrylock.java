package java3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//Question 16

public class DeadlockTrylock {

    Lock lock1 = new ReentrantLock(true);
    Lock lock2 = new ReentrantLock(true);

    void checkLock(Lock lock1, Lock lock2){

            boolean isLock1= lock1.tryLock();
            boolean isLock2= lock2.tryLock();

        if(isLock1){
            lock1.unlock();
            System.out.println("unlock lock1");
        }
        if (isLock2){
            lock2.unlock();
            System.out.println("unlock lock2");
        }
    }
    public void task1(){
        checkLock(lock1,lock2);
        System.out.println("lock 1 in task 1");
        System.out.println("lock 2 in task 1");
    }

    public void task2(){
        checkLock(lock2, lock1);
        System.out.println("lock 2 in task 2");
        System.out.println("lock 1 in task 2");
    }

    public static void main(String[] args) throws InterruptedException {
       DeadlockTrylock deadlockTrylock = new DeadlockTrylock();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                deadlockTrylock.task1();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                deadlockTrylock.task2();
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
}
