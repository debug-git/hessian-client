package com.example.hessian_client.controller;

import com.example.hessian_client.service.HessianTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestHessianController {
    @Autowired
    private HessianTest hessianTest;
    private int a2;

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test(){
        String name = "尼古拉斯赵四";
        String result = hessianTest.test(name);
        System.out.println(hessianTest.hashCode());
        return result;
    }

    public static void main(String[] args) {
//        long time = System.currentTimeMillis();
//        Integer a = 5000;
//        int a2 = 5000;
//        System.out.println(a.equals(a2));
//        System.out.println("比较127以外的数字耗时"+(System.currentTimeMillis()-time)+"毫秒");
//
//        long time2 = System.currentTimeMillis();
//        Integer b = 3;
//        int b2 =3;
//        System.out.println(b==b2);
//        System.out.println("比较127以内的数字耗时"+(System.currentTimeMillis()-time2)+"毫秒");

        String c = "Spring";
        String c2 = new String("Spring");
        String c3 = "Spring";

        System.out.println(c==c2);
        System.out.println(c==c3);
        System.out.println(c.hashCode()+","+c2.hashCode()+","+c3.hashCode());

        c = "111";
        System.out.println(c3);
        System.out.println(c.hashCode()+","+c2.hashCode()+","+c3.hashCode());
    }
}
