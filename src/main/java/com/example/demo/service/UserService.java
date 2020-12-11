package com.example.demo.service;

import com.example.demo.dataoobject.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @Author:lixuewei
 * @Date:2020/12/816:02
 */
public interface UserService {
    //定义一些要用到的方法
    // 登陆
    void login(Integer id,String password);

    //新建
    User create(User user);

    //查询一个User
    User findOne(Integer id);

    //修改用户密码
    User AlterPassword(Integer id,String password);

    //修改用户名
    User AlterName(Integer id,String name);

    //注销用户
    User Delete(User user);

}
