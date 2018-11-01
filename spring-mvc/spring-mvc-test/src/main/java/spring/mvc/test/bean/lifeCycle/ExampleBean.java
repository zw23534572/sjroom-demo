package spring.mvc.test.bean.lifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ExampleBean implements InitializingBean, DisposableBean {
    public void init() {
        System.out.println("ExampleBean init started");
    }

    /**
     * implements DisposableBean 回调
     *
     * @throws Exception
     */
    public void destroy() throws Exception {
        System.out.println("ExampleBean destroy started");
    }

    /**
     * implements InitializingBean 回调
     *
     * @throws Exception
     */
    public void afterPropertiesSet() throws Exception {
        System.out.println("ExampleBean afterPropertiesSet started");
    }
}
