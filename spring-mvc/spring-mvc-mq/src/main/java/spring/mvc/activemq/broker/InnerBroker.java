package spring.mvc.activemq.broker;

import org.apache.activemq.broker.BrokerService;

/**
 * <B>说明：</B><BR>
 *
 * @author ZhouWei
 * @version 1.0.0.
 * @date 2018-06-05 16-35
 */
public class InnerBroker {
    public static void main(String args[]) throws Exception {
        BrokerService broker = new BrokerService();
        // 启用broker的JMX监控功能
        broker.setUseJmx(true);
        // 设置broker名字
        broker.setBrokerName("MyBroker");
        // 是否使用持久化
        broker.setPersistent(false);
        // 添加连接协议，地址
        broker.addConnector("tcp://localhost:61616");
        broker.start();
    }
}
