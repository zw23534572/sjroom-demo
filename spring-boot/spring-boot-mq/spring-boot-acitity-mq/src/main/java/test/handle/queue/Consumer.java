package test.handle.queue;

import lombok.extern.slf4j.Slf4j;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;


/**
 * @author manson.zhou
 */
@Slf4j
@Component
public class Consumer {
    @JmsListener(destination = "sample.queue")
    public void receiveQueue(String text) {
        log.info(">> {}", text);
        long endTime =System.currentTimeMillis();
        long startTime = Long.valueOf(text.split(":")[1]);
        long time = endTime-startTime;
        if (time > 1000){
            log.error("超时1秒 {}", text);
        }else if (time > 2000){
            log.error("超时2秒 {}", text);
        }else if (time > 4000){
            log.error("超时4秒 {}", text);
        }else if (time > 5000){
            log.error("超时5秒 {}", text);
        }
        System.out.println("程序运行的时间为："+(endTime-startTime));
    }
}