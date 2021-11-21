package com.threads;

public class MyThread2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.println(Thread.currentThread().getName()+"--"+i);
        }
    }
}


