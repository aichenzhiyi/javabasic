package com.threads;

public class TaskThread implements Runnable {

    private String msg;

    public TaskThread(String msg){
        this.msg = msg;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName()+"--"+msg);
    }
}
    