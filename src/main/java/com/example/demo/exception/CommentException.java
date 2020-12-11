package com.example.demo.exception;

import com.example.demo.enums.ResultEnum;

/**
 * @Author:lixuewei
 * @Date:2020/12/910:20
 */
public class CommentException extends RuntimeException {
    private Integer code;

    public CommentException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }
}