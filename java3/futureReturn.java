package java3;
import java.util.concurrent.*;

//Question 6

public class futureReturn {

        public static void main(String[] args) throws ExecutionException, InterruptedException {
            ExecutorService es = Executors.newSingleThreadExecutor();
            Future<String> future = es.submit(new Callable<String>() {
                @Override
                public String call() throws Exception {
                    return ("return future");
                }
            });

            es.shutdown();

            if (future.isDone()) {
                try {
                    System.out.println(future.get());
                    System.out.println("Done");
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }

            else if(future.isCancelled()){
                System.out.println("Cancelled");
                System.out.println("Your task has been cancelled");
            }
            else {
                System.out.println("success");
            }
//            es.shutdown();
        }
    }

