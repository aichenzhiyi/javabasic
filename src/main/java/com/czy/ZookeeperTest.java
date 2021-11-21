package com.czy;

import org.apache.zookeeper.*;
import org.apache.zookeeper.data.ACL;
import org.apache.zookeeper.data.Id;
import org.apache.zookeeper.data.Stat;

import java.io.IOException;
import java.util.ArrayList;

public class ZookeeperTest {
    public static void main(String[] args) throws IOException {
        ZooKeeper zk = new ZooKeeper("", 2000, new Watcher() {
            public void process(WatchedEvent event) {

            }
        });
        ArrayList<ACL> aclList = new ArrayList<ACL>();

        zk.create("path", "data".getBytes(), aclList, CreateMode.PERSISTENT, new AsyncCallback.StringCallback() {
            public void processResult(int rc, String path, Object ctx, String name) {

            }
        },"aaaa");

        zk.setData("path", "data".getBytes(), 1, new AsyncCallback.StatCallback() {
            public void processResult(int rc, String path, Object ctx, Stat stat) {

            }
        },"aaaa");


        Watcher watcher = new Watcher() {
            public void process(WatchedEvent event) {
                synchronized (this){
                    notifyAll();
                }
            }
        };
    }
}
    