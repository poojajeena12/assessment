package java3;

//Question 1

class ThreadClass extends Thread{
    public static void main(String[] args) {
        ThreadClass thread = new ThreadClass();
        thread.start();
    }
    public void run(){
        System.out.println("thread running ");
    }
}