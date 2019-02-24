package java3;
import java.util.concurrent.*;

public class q6 {

        public static void main(String[] args) throws ExecutionException, InterruptedException {
            ExecutorService es = Executors.newSingleThreadExecutor();

            Future<Integer> integerFuture = es.submit(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    return 2;
                }
            });

            es.shutdown();

            if (integerFuture.isDone()) {
                System.out.println("isDone");
                System.out.println(integerFuture.get());
            }

            if(integerFuture.isCancelled()){
                System.out.println("isCancelled");
                System.out.println("Your task has been cancelled");
            }
            else {
                System.out.println("success");
            }
        }
    }

