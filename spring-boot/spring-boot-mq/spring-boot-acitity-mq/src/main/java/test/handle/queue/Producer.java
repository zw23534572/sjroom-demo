package test.handle.queue;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.jms.Queue;

/**
 * <B>说明：</B><BR>
 *
 * @author ZhouWei
 * @version 1.0.0.
 * @date 2018-05-31 15-42
 */
@Slf4j
@Component
@EnableScheduling
public class Producer {
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

//    @Autowired
    private Queue queue;

//    @Scheduled(fixedDelay = 1)
    // 每3s执行1次
    public void send() {

        log.info(">> send !!!");
        long startTime = System.currentTimeMillis();//记录当前时间
        this.jmsMessagingTemplate.convertAndSend(this.queue, "hi,activeMQ:" + startTime);
    }

}
