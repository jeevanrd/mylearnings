package threading;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ThreadStopExample {
    public static volatile Boolean test = false;
    Set set = new HashSet<>();
    Set set1 = new LinkedHashSet<>();

    public static void main(String args[]) throws InterruptedException {

        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("started task1");
                while(!test) {
                    System.out.println("running");
                }
                System.out.println("exiting task1");
            }
        };

        Runnable task2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("started task2");
                test = true;
                System.out.println("exiting task2");
            }

        };

        Thread thread1 = new Thread(task);
        thread1.start();
        Thread thread2 = new Thread(task2);
        thread2.start();
        System.out.println("Done!");
    }
}
