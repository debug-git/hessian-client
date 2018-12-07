package com.example.hessian_client;

import com.caucho.hessian.client.HessianProxyFactory;
import com.example.hessian_client.service.HessianTest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.remoting.caucho.HessianProxyFactoryBean;

import java.net.MalformedURLException;

@SpringBootApplication
public class HessianClientApplication {

    //方法一:直接创建HessianTest对象
//    @Bean
//    public HessianTest securityClient() {
//        HessianProxyFactory factory = new HessianProxyFactory();
////        factory.setServiceUrl("http://127.0.0.1:8080/hessian/test");
////        factory.setServiceInterface(HessianTest.class);
//        HessianTest hessianTest = null;
//        try {
//            factory.setOverloadEnabled(true);
//            hessianTest = (HessianTest)factory.create(HessianTest.class,"http://127.0.0.1:8080/hessian/test");
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        }
//        return hessianTest;
//    }

    //方法二:通过HessianProxyFactoryBean创建HessianTest对象
    @Bean
    public HessianProxyFactoryBean securityClient() {
        HessianProxyFactoryBean factory = new HessianProxyFactoryBean();
        factory.setServiceUrl("http://127.0.0.1:8080/hessian/test");
        factory.setServiceInterface(HessianTest.class);
        return factory;
    }

    public static void main(String[] args) {
        SpringApplication.run(HessianClientApplication.class, args);
    }
}
