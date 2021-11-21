package com.mq;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class Producer {

    private final static String QUEUE_NAME = "simple_queue";

    public static void main(String[] args) throws IOException, TimeoutException {
        //获取到连接以及mq通道
        Connection connection = ConnectionUtil.getConnection();
        //从连接中创建通道，这是完成大部分api的地方
        Channel channel = connection.createChannel();

        // 声明（创建）队列，必须声明队列才能够发送消息，我们可以把消息发送到队列中。
        // 声明一个队列是幂等的 - 只有当它不存在时才会被创建
        channel.queueDeclare(QUEUE_NAME,false,false,false,null);

        //消息内容
        String msg = "Hello World";
        channel.basicPublish("",QUEUE_NAME,null,msg.getBytes());

        System.out.println("【发送消息:】"+msg);

        channel.close();
        connection.close();
    }
}
    