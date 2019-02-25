package java3;

public class q2 extends Thread{

    public static void main(String args[]) throws InterruptedException {
        q2 t1=new q2();
        q2 t2=new q2();
        t1.start();
        t1.join();
        System.out.println("thread 1 completed");

        t2.start();
        t2.join();
        System.out.println("thread 2 completed");
    }
    public void run(){
        for(int i=1;i<4;i++){
            try{
                Thread.sleep(500);
            }catch(Exception e){System.out.println(e);}
            System.out.println(i);
        }
    }

}

