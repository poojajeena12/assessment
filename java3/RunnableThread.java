package java3;

//Question 1

public class RunnableThread implements Runnable{
    public static void main(String[] args) {

        Thread t = new Thread(new RunnableThread());
        t.start();
    }

    @Override
    public void run() {
        System.out.println("thread running");
    }
}
