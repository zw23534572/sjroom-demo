package test.handle.topic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;


@Slf4j
@Component
public class TopicConsumer {

    @JmsListener(destination = "sample.topic")
    public void receiveTopic(String text) {
        System.out.println("接收到text");
    }


//    @JmsListener(destination = "sample.topic")
//    public void receiveTopic2(String text) throws InterruptedException {
//        long endTime = System.currentTimeMillis();
//        long startTime = Long.valueOf(text.split(":")[1]);
//        long time = endTime - startTime;
//        Thread.sleep(10000);
//        if (time > 7000) {
//            log.error("topic2超时7秒 {}", text);
//        } else if (time > 5000) {
//            log.error("topic2超时5秒 {}", text);
//        } else if (time > 4000) {
//            log.error("topic2超时4秒 {}", text);
//        } else if (time > 2000) {
//            log.error("topic2超时2秒 {}", text);
//        }
//    }
}