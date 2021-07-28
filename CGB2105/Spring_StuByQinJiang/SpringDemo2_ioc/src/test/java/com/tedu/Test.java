package com.tedu;

import com.tedu.pojo.Hello;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.jupiter.api.Test
    public void test(){
        ClassPathXmlApplicationContext hello =
                new ClassPathXmlApplicationContext("beans.xml");
        Hello hello1 = (Hello) hello.getBean("hello");
        System.out.println(hello1);
        System.out.println(hello1.getName());
        hello1.show();
    }
}
