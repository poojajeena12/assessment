package java3;

//Question 10

public class SynchronizeMethod {
    int task1=0;
    int task2=0;
    int count=0;
    synchronized public void taskCount(){
        count++;
    }
    void task1(){
        for (int i=0;i<3;i++) {
          task1++;
          taskCount();
        }
        System.out.println("task 1 running , count = " + this.count);
    }
    void task2(){
        for (int i=0;i<8;i++){
            task2++;
            taskCount();
        }
        System.out.println("task 2 running, count = " + this.count);
    }

    public static void main(String[] args) throws InterruptedException {

                SynchronizeMethod synchronizeMethod = new SynchronizeMethod();
                Thread thread1 = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        synchronizeMethod.task1();
                    }
                });
                Thread thread2 = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        synchronizeMethod.task2();
                    }
                });
                thread1.start();
                thread1.join();
                thread2.start();
                thread2.join();
                System.out.println("total count = " + synchronizeMethod.count);
            }
        }
