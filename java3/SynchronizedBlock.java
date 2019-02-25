package java3;

//Question 11

public class SynchronizedBlock {
    int count=0;
    public void taskcount(){
        synchronized (this){
            count++;
        }
    }
    void task1(){
        for (int i=0;i<3;i++) {
            taskcount();
        }
        System.out.println("task 1 running , count = " + this.count);
    }
    void task2(){
        for (int i=0;i<8;i++){
            taskcount();
        }
        System.out.println("task 2 running, count = " + this.count);
    }

    public static void main(String[] args) throws InterruptedException {
                SynchronizedBlock synchronizedBlock = new SynchronizedBlock();
                Thread thread1 = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        synchronizedBlock.task1();
                        System.out.println("thread 1");
                    }
                });
                Thread thread2 = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        synchronizedBlock.task2();
                        System.out.println("thread 2");
                    }
                });
                thread1.start();
                thread1.join();
                thread2.start();
                thread2.join();
        System.out.println("completed");
    }
}
