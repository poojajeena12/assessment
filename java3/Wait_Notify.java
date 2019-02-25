package java3;

//Question 13

public class Wait_Notify {

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
                System.out.println("task 2 running");
                System.out.println("task 2 completed");
                notifyAll();
            }
        }

        public static void main(String[] args) {
            Wait_Notify waitNotify = new Wait_Notify();
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

            thread1.start();
            thread2.start();
        }
    }
