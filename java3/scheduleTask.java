package java3;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import static java.lang.Thread.sleep;
import static java.util.concurrent.TimeUnit.SECONDS;

//Question 8

public class scheduleTask {
    public static void main(String[] args) throws InterruptedException {

        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();

        scheduledExecutorService.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("schedule 1 " + new Date());
            }
        }, 1, SECONDS);

        scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                    System.out.println("schedule at fixed rate " + new Date());
                }
        },1, 2L, SECONDS);
//        sleep(10000L);

        scheduledExecutorService.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {
                System.out.println("schedule with fixed delay " + new Date());
            }
        }, 2,2L, SECONDS);
        sleep(8000L);
        scheduledExecutorService.shutdown();
    }
}
