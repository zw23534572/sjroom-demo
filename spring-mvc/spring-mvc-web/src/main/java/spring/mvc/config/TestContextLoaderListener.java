package spring.mvc.config;

import org.springframework.web.context.ContextLoaderListener;

import javax.servlet.ServletContextEvent;

/**
 * @author manson.zhou on 2018/2/5.
 */
public class TestContextLoaderListener extends ContextLoaderListener {
    @Override
    public void contextInitialized(ServletContextEvent var1) {
        super.contextInitialized(var1);
        System.out.println("TestContextLoaderListener contextInitialized");

    }

    @Override
    public void contextDestroyed(ServletContextEvent var1) {
        super.contextDestroyed(var1);
        System.out.println("TestContextLoaderListener contextDestroyed");
    }
}
