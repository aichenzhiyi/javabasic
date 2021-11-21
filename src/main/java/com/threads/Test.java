package com.threads;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.*;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 2, 0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>(3));
        executor.execute(new TaskThread("任务1"));
        executor.execute(new TaskThread("任务2"));
        executor.execute(new TaskThread("任务3"));
        executor.execute(new TaskThread("任务4"));
        executor.execute(new TaskThread("任务5"));
        Thread.sleep(1);
        executor.execute(new TaskThread("任务6"));

    }
}


