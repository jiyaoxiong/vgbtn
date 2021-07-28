package com.jt.controller;

import com.jt.pojo.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * 1、接收用户的请求
 * 2、响应用户的json串数据
 *      (1) @ResponseBody 可以将对象转换成json串
 *      (2) 如果返回String类型的值，则返回本身
 *      json的本质是串
 * */
@RestController
//spring容器启动时，动态添加配置文件，一般需要修改字符集
/**
 * 注解赋值:
 * 1、必须满足key-value结构
 * 2、如果属性只有一个且是value属性，可以省略value=
 * 3、出现乱码，properties配置文件的字符集配为utf8
 * */
@PropertySource(value = "classpath:/person.properties",encoding = "utf8")
public class HelloController {
    /**
     * 规则：从Spring容器中根据key获取数据赋值
     * springel表达式 简称spel表达式 语法：${key}
     * */
    @Value("${User.a}")
    private Integer a;
    @Value("${person.name}")
    private String name;
    @RequestMapping("getMsg")
    public String getMsg(){
        return "雨下"+ a + "天" + "," + name;
    }

    @RequestMapping("test")
    public void testLomBok(){
        User user = new User();
        System.out.println(user.setId(11).setName("熊二").getId());
        System.out.println(user.setId(12).setName("光头强").getName());
    }
}
