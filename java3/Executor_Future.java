package java3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//Question 7

public class Executor_Future {
        public static void main(String[] args) throws InterruptedException {
            List<Callable<Integer>> CallableList = new ArrayList<>();

            CallableList.add(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    return 1;
                }
            });
            CallableList.add(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    return 2;
                }
            });
            CallableList.add(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    return 3;
                }
            });
            CallableList.add(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    return 4;
                }
            });

            ExecutorService es = Executors.newSingleThreadExecutor();

            List<Future<Integer>> futureList = es.invokeAll(CallableList);
            for (Future<Integer> e : futureList) {
                if (e.isDone()) {
                    try {
                        System.out.println("done!");
                        System.out.println(e.get());
                    } catch (InterruptedException e1) {
                        e1.printStackTrace();
                    } catch (ExecutionException e1) {
                        e1.printStackTrace();
                    }
                }
            }
        }
    }


