package test.handle.topic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Topic;

/**
 * <B>说明：</B><BR>
 *
 * @author ZhouWei
 * @version 1.0.0.
 * @date 2018-05-31 15-42
 */
@Slf4j
@Component
public class TopicProducer {
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Autowired
    private Topic topic;

    public boolean send(int time) {

        log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>send !!!");
        jmsMessagingTemplate.getJmsTemplate().setDeliveryMode(1);
        for (int i = 0; i < time; i++) {
            Thread t = new Thread(new Task(jmsMessagingTemplate, topic));
            t.start();
        }
        return true;
    }

}
