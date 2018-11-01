package spring.mvc.activemq.queue;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * <B>说明：</B><BR>
 *
 * @author ZhouWei
 * @version 1.0.0.
 * @date 2018-06-05 10-08
 */
public class ReceiverQueue implements Runnable{

    private String threadName;


    ReceiverQueue(String threadName) {
        this.threadName = threadName;
    }


    public void run() {

        // ConnectionFactory：连接工厂，JMS用它创建连接
        ConnectionFactory connectionFactory;

        // Connection：JMS客户端到JMS Provider的连接
        Connection connection = null;

        // Session：一个发送或接收消息的线程
        Session session;

        // Destination：消息的目的地;消息发送给谁.
        Destination destination;

        //消费者，消息接收者
        MessageConsumer consumer;

        connectionFactory = new ActiveMQConnectionFactory(
                ActiveMQConnection.DEFAULT_USER,
                ActiveMQConnection.DEFAULT_PASSWORD, "tcp://sjroom.cn:61616");

        try {

            //构造从工厂得到连接对象
            connection = connectionFactory.createConnection();

            //启动
            connection.start();

            //获取操作连接,默认自动向服务器发送接收成功的响应
            session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

            //获取session注意参数值FirstTopic是一个服务器的topic
            destination = session.createQueue("FirstQueue");

            consumer = session.createConsumer(destination);

            while (true) {

                //设置接收者接收消息的时间，为了便于测试，这里设定为100s
                TextMessage message = (TextMessage) consumer.receive(100 * 1000);

                if (null != message) {
                    System.out.println("线程" + threadName + "收到消息:" + message.getText());
                } else {
                    continue;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != connection)
                    connection.close();
            } catch (Throwable ignore) {

            }

        }

    }


    public static void main(String[] args) {
        //这里启动3个线程来监听FirstTopic的消息，与queue的方式不一样三个线程都能收到同样的消息
        ReceiverQueue receive1 = new ReceiverQueue("thread1");
        ReceiverQueue receive2 = new ReceiverQueue("thread2");
        ReceiverQueue receive3 = new ReceiverQueue("thread3");
        Thread thread1 = new Thread(receive1);
        Thread thread2 = new Thread(receive2);
        Thread thread3 = new Thread(receive3);
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
