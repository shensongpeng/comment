package com.example.demo.dataoobject;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * @Author:lixuewei
 * @Date:2020/12/814:45
 */
@Data
@Entity
@DynamicInsert
@DynamicUpdate
public class User {
    /*
    * id 用户id
    * name 用户姓名
    * password 用户密码
    * creat_time 创建用户时间
    * avatarUrl 头像链接接地址
    * phone 用户登录手机号
    * */
    @Id
    private Integer id;
    private String name;
    private String password;
    private Date creatTime;
    private String avatarUrl;
    private String phone;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }
}

//
// `id` int NOT NULL COMMENT '主键id',
//         `name` varchar(255) DEFAULT NULL COMMENT '用户姓名',
//         `password` varchar(255) DEFAULT NULL COMMENT '用户密码',
//         `creat_time` datetime DEFAULT NULL COMMENT '创建时间',
//         `avatarUrl` varchar(255) DE