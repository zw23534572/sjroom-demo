package spring.mvc.test.bean.lifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * bean 的生命周期测试
 */
public class BeanLifeCycleDemo {

    public static void main(String[] args) {
        BeanLifeCycleDemo beanLifeCycleDemo = new BeanLifeCycleDemo();
        beanLifeCycleDemo.testLifeCycleBean();
    }

    /**
     * 测试 life cyle bean
     * 你需要注册一个在 AbstractApplicationContext 类中声明的关闭 hook 的 registerShutdownHook() 方法。
     * 它将确保正常关闭，并且调用相关的 destroy 方法。
     */
    public void testLifeCycleBean() {
        AbstractApplicationContext context  = new ClassPathXmlApplicationContext("beans-life-cycle.xml");
        context.getBean("exampleBean");
        context.registerShutdownHook();
    }
}
