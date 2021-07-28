package com.jt.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
//@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor

//Ctrl+O 查看当前类中的所有方法
public class User {
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public User setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }
}
