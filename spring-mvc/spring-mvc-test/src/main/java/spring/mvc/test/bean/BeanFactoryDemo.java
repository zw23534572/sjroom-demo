package spring.mvc.test.bean;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import spring.mvc.test.HelloWorld;

public class BeanFactoryDemo {

    /**
     * 主方法
     *
     * @param args
     */
    public static void main(String[] args) {
        BeanFactoryDemo beanFactoryDemo = new BeanFactoryDemo();
        beanFactoryDemo.createXmlBeanFactory();
    }

    /**
     * 通过XmlBeanFactory读取bean
     */
    public void createXmlBeanFactory() {
        XmlBeanFactory factory = new XmlBeanFactory
                (new ClassPathResource("Beans.xml"));
        HelloWorld obj = (HelloWorld) factory.getBean("helloWorld");
        obj.getMessage();
    }
}
