package java3;

//Question 14

public class WaitNotifyAll {

    public void task1(){
        synchronized (this) {
            try {
                System.out.println("task 1 waiting!!");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("task 1 continued and completed");
        }
    }
    public void task2(){
        synchronized (this) {
            try {
                System.out.println("task 2 waiting!!");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("task 2 continued and completed");
        }
    }
    public void task3(){
        synchronized (this) {
            try {
                System.out.println("task 3 waiting!!");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("task 3 continued and completed");
        }
    }
    public void task4(){
        synchronized (this) {
            System.out.println("task 4 running");
            System.out.println("task 4 completed");
            notifyAll();
        }
    }

    public static void main(String[] args) {
        WaitNotifyAll waitNotify = new WaitNotifyAll();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                waitNotify.task1();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                waitNotify.task2();
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                waitNotify.task3();
            }
        });
        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                waitNotify.task4();
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
