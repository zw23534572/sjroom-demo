import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;

public class Test {
    public static void main(String[] args) {
//        HelloServiceProxy proxy = new HelloServiceProxy();
//        HelloService1 service = new HelloServiceImpl();
//        //绑定代理对象。
//        service = (HelloService1) proxy.bind(service, new Class[] {Test.class});
//        //这里service经过绑定，就会进入invoke方法里面了。
//        service.sayHello1("张三");

        HashMap map = new HashMap();
        map.put("zhouwei","zz");
        System.out.println(map.put("zhouwei","cccc"));

        System.out.println(60 >> 3);

    }

    static int indexFor(int h, int length) {
        // assert Integer.bitCount(length) == 1 : "length must be a non-zero power of 2";
        return h & (length-1);
    }
}
