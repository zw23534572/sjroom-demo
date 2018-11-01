package test.handle.topic;

import org.springframework.jms.core.JmsMessagingTemplate;

import javax.jms.Topic;

/**
 * <B>说明：</B><BR>
 *
 * @author ZhouWei
 * @version 1.0.0.
 * @date 2018-05-31 17-01
 */
public class Task implements Runnable {
    private JmsMessagingTemplate jmsMessagingTemplate;
    private Topic topic;

    public Task(JmsMessagingTemplate jmsMessagingTemplate, Topic topic) {
        this.jmsMessagingTemplate = jmsMessagingTemplate;
        this.topic = topic;
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        this.jmsMessagingTemplate.convertAndSend(this.topic, "hi,activeMQ topic:" + startTime);
        System.out.println("mq endTime: " + (System.currentTimeMillis() - startTime));
    }
}
