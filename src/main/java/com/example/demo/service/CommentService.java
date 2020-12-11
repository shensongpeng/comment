package com.example.demo.service;

import com.example.demo.dataoobject.Comment;

/**
 * @Author:lixuewei
 * @Date:2020/12/816:14
 */
public interface CommentService {
    //增加评论
    Comment increase(Comment comment);

    //删除评论 只有发帖子的人才能删除评论
    Comment del(Comment comment);


    //增加点赞(一个人只能点一个赞)



    //取消点赞


    //根据时间查询

}
