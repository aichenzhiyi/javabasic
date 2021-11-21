package com.threads;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread implements Runnable {

    @Override
    public void run() {
        ReentrantLock lock = new ReentrantLock();
        Condition condition = lock.newCondition();
        condition.signal();
    }
}


