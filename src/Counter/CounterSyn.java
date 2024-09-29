package Counter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CounterSyn {

    private int count;

    public synchronized void oneplus() {
        count++;
    }

    public int getCount() {
        return count;
    }


    public static void main(String[] args) {


        CounterSyn counterSyn = new CounterSyn();


        ExecutorService executor = Executors.newCachedThreadPool();

        for (int i = 0; i < 1000; i++) {
            executor.submit(counterSyn::oneplus);
        }

        executor.shutdown();

        System.out.println("counterSyn.getCount() = " + counterSyn.getCount());


    }


}
















