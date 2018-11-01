package com.hqch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author huqichao
 * @date 2018-05-28 10:10
 */
@SpringBootApplication
//@EnableFeignClients(basePackages={"com.dazong.number"})
public class StartupServer {

    public static void main(String[] args) {
        System.out.println("00000000");
        SpringApplication.run(StartupServer.class, args);
    }

//    @Bean
//    public okhttp3.OkHttpClient okHttpClient(@Autowired FeignInterceptor feignInterceptor){
//        okhttp3.OkHttpClient.Builder clientBuilder = new okhttp3.OkHttpClient.Builder()
//                .readTimeout(30, TimeUnit.SECONDS) //读取超时
//                .connectTimeout(10, TimeUnit.SECONDS) //连接超时
//                .writeTimeout(60, TimeUnit.SECONDS) //写入超时
//                .connectionPool(new ConnectionPool(10, 3, TimeUnit.MINUTES))
//                .addInterceptor(feignInterceptor);
//        return clientBuilder.build();
//    }

//    @Bean
//    @Scope("prototype")
//    @ConditionalOnMissingBean
//    public Feign.Builder feignBuilder(){
//        Feign.Builder builder = Feign.builder();
//        builder.invocationHandlerFactory(new DZInvocationHandlerFactory());
//        return builder;
//    }
//
//    @Bean
//    @Scope("prototype")
//    @ConditionalOnMissingBean
//    @ConditionalOnProperty(name = "feign.hystrix.enabled", matchIfMissing = false)
//    public Feign.Builder feignHystrixBuilder() {
//        Feign.Builder builder = HystrixFeign.builder();
//        builder.invocationHandlerFactory(new DZInvocationHandlerFactory());
//        return builder;
//    }
}
