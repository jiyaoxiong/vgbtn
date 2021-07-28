package com.jt.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * 对象关系映射配置:
 *      1.User对象需要与demo_user表绑定
 *      2.User对象中的属性与表中的字段一一绑定
 */
@Data
@Accessors(chain = true)
@TableName("demo_user")
public class User implements Serializable {
    //主键自增
    @TableId(type=IdType.AUTO)
    private Integer id;
    //@TableField("name")
    //如果属性与字段同名(包括驼峰规则)注解可以省略
    private String name;
    private Integer age;
    private String sex;
}
