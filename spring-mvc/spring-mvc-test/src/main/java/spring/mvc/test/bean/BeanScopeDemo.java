package spring.mvc.test.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.mvc.test.HelloWorld;


/**
 * bean 的作用域
 */
public class BeanScopeDemo {

    public static void main(String[] args) {
        BeanScopeDemo beanScopeDemo = new BeanScopeDemo();
        beanScopeDemo.testScopeSignleton();
        beanScopeDemo.testScopePrototype();
    }

    /**
     * 测试 bean的作用域为单例模式
     * bean的配置名称，不区分大小，Beans.xml与beans.xml都能加载
     */
    public void testScopeSignleton() {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans-scope.xml");
        HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
        objA.setMessage("I'm object A");
        objA.getMessage();
        HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
        objB.getMessage();
    }

    /**
     * 测试 bean的作用域为单例模式
     * bean的配置名称，不区分大小，Beans.xml与beans.xml都能加载
     */
    public void testScopePrototype() {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans-scope.xml");
        HelloWorld objA = (HelloWorld) context.getBean("helloWorldPrototype");
        objA.setMessage("I'm object A");
        objA.getMessage();
        HelloWorld objB = (HelloWorld) context.getBean("helloWorldPrototype");
        objB.getMessage();
    }

}
