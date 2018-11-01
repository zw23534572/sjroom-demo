package spring.mvc.test.applicationContext;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import spring.mvc.test.HelloWorld;

/**
 * ApplicationContent
 *
 * @author zw23534572
 */
public class ApplicationContentDemo {

    /**
     * 主方法
     *
     * @param args
     */
    public static void main(String[] args) {
        ApplicationContentDemo applicationContentDemo = new ApplicationContentDemo();
        applicationContentDemo.createApplicationContext();
        applicationContentDemo.createFileSystemXmlApplicationContext();
    }

    /**
     * 通过ApplicationContext读取bean
     */
    public void createApplicationContext() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.getMessage();
    }

    /**
     * 通过读取文件创建bean
     */
    public void createFileSystemXmlApplicationContext() {
        ApplicationContext context = new FileSystemXmlApplicationContext
                ("/spring-mvc-test/src/main/resources/beans.xml");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.getMessage();
    }


}
