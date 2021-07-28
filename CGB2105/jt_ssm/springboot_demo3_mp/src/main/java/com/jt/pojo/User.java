package com.jt.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 什么是序列化？
 * 保证数据传输的完整性
 * */
@Data
@Accessors(chain = true)
//实体对象的作用：实现参数传递
public class User implements Serializable {//实现序列化
    private Integer id;
    private String name;
    private Integer age;
    private String sex;
}
