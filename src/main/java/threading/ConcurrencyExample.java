package threading;

import java.util.concurrent.*;

public class ConcurrencyExample {
    public static void main(String args[]) throws Exception {

        Callable<String> task1 = () -> {
            Thread.sleep(5000);
            return "123";
        };

        Callable<String> task2 = () -> {
            return "234";
        };

        task1.call();

        Runnable task = new Runnable() {
            @Override
            public void run() {
                String name = Thread.currentThread().getName();
                System.out.println("Hello " + name);

                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Bar " + name);
            }
        };
        task.run();
        Thread thread = new Thread(task);
        thread.start();

        System.out.println("Done!");
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future future = executor.submit(task1);

        executor.execute(task);


        System.out.println("future --" + future.get());
//        System.out.println("future --" + future.get());

//        executor.shutdown();
//        executor.awaitTermination(5, TimeUnit.SECONDS);
        executor.shutdownNow();

        System.out.println("Done!");
    }
}
