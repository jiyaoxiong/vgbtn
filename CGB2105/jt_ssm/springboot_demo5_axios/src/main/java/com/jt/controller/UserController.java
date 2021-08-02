package com.jt.controller;

import com.jt.Service.UserService;
import com.jt.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * URL: http://localhost:8090/getUserById?id=100
     */
    @RequestMapping("/getUserById")
    public String getUserById(Integer id) {
        return "动态获取参数：" + id;
    }

    /**
     * 接收参数对象
     * URL:http://localhost:8090/getUser?id=100&name="tomcat"&age=18
     * 对象解析为JSON数据
     */
    @RequestMapping("/getUser")
    public User getUser(User user) {
        return user;
    }

    /**
     * 1、RestFul实现用户查询
     * URL:http://localhost:8090/user/100
     * type:get
     * RequestMapping默认可以接收所有请求类型
     * <p>
     * RestFul语法：
     * 1、参数位置必须固定
     * 2、参数必须使用{}包裹
     * 3、必须使用@Pathvirable动态接收参数
     * 注意：{参数名称}必须与方法中的名称一致
     */
//    @RequestMapping(value = "/user", method = RequestMethod.GET)
//    @GetMapping("/user/{name}")
//    public String restFulGet(@PathVariable(value = "name") Integer id){
    @GetMapping("/user/{id}")
    public String restFulGet(@PathVariable Integer id) {
        return "restful动态获取参数：" + id;
    }

    /**
     * 需求: 查询name=tomcat age=18 sex=女的用户
     * 要求使用:restFul
     * URL: http://localhost:8090/user/tomcat/18/女
     * restFul的优化:
     *  如果{参数名称}与对象中的属性名称一致,
     *      则SpringMVC动态的为对象赋值,
     *      @PathVariable 可以省略
     * 注意事项:
     *      前后端的参数的传递必须保持一致!!!!
     */
    @GetMapping("/user/{name}/{age}/{sex}")
    public User restGetUser(User user){
        return user;
    }


}
