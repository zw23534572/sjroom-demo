package test.handle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import test.handle.topic.TopicProducer;

/**
 * <B>说明：</B><BR>
 *
 * @author ZhouWei
 * @version 1.0.0.
 * @date 2018-05-31 17-14
 */
@Controller
public class IndexController {

    @Autowired
    TopicProducer topicProducer;

    @RequestMapping("test1")
    @ResponseBody
    public boolean test1() {
        return topicProducer.send(1);
    }


    @RequestMapping("test10")
    @ResponseBody
    public boolean test10() {
        return topicProducer.send(10);
    }

    @RequestMapping("test40")
    @ResponseBody
    public boolean test40() throws InterruptedException {
        for (int i = 0; i < 1000; i++) {
            Thread.sleep(5);
            topicProducer.send(1);
        }
        return false;
    }

    @RequestMapping("test100")
    @ResponseBody
    public boolean test100() {
        return topicProducer.send(100);
    }

    @RequestMapping("test200")
    @ResponseBody
    public boolean test200() {
        return topicProducer.send(200);
    }

    @RequestMapping("test500")
    @ResponseBody
    public boolean test500() {
        return topicProducer.send(500);
    }


    @Autowired
    JmsMessagingTemplate jmsMessagingTemplate;

    @RequestMapping("testBody")
    @ResponseBody
    public void testBody() {
        this.jmsMessagingTemplate.convertAndSend("sample.queue", "test");
        this.jmsMessagingTemplate.convertAndSend("sample.queue", "test:1");
    }

}
