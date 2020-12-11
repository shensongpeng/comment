package com.example.demo.enums;

import com.sun.org.apache.bcel.internal.generic.NEW;
import lombok.Getter;

/**
 * @Author:lixuewei
 * @Date:2020/11/2710:17
 */
@Getter
public enum ResultEnum {

    //ctrl+shift+u 小写边大写
    USER_EXIST(10,"插入用户已存在"),

    PASSWORD_ERROR(11,"密码错误"),

    PASSWORD_IDENTICAL(12,"新密码与旧密码一致"),

    NAME_IDENTICAL(13,"新用户名与旧用户名一致"),

    DUPLICATE_SERNAME(12,"用户名重复"),

    USER_NOT_EXIST(13,"用户不存在"),

    TOPIC_NOT_EXIST(14,"帖子不存在")
    ;
    private Integer code;

    private String message;

    ResultEnum(Integer code,String message) {
        this.code = code;
        this.message = message;
    }


}
