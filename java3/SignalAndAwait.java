package java3;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// Question 15

public class SignalAndAwait {

        Lock l = new ReentrantLock(true);
        Condition condition = l.newCondition();

        public void task1() {
            try {
                l.lock();
                System.out.println("task 1 running");
                condition.await();
                System.out.println("task 1 finished");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                l.unlock();
            }

        }
    public void task2() {
        try {
            l.lock();
            System.out.println("task 2 running");
            condition.await();
            System.out.println("task 2 finished");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            l.unlock();
        }

    }


    public void task3() {
            try{
                l.lock();
                System.out.println("task 3 running");
                System.out.println("task 3 finished");
                condition.signalAll();
            }finally {
                l.unlock();
            }
        }

        public static void main(String[] args) throws InterruptedException {
            SignalAndAwait signalAndAwait = new SignalAndAwait();
            Thread thread1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    signalAndAwait.task1();
                }
            });
            Thread thread2 = new Thread(new Runnable() {
                @Override
                public void run() {
                   signalAndAwait.task2();
                }
            });
            Thread thread3 = new Thread(new Runnable() {
                @Override
                public void run() {
                    signalAndAwait.task3();
                }
            });
            thread1.start();
            thread2.start();
            thread3.start();
//            thread1.join();
//            thread2.join();
        }
    }
