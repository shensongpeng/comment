package com.example.demo.service;

import com.example.demo.dataoobject.PosterDetail;
import com.example.demo.dataoobject.User;

/**
 * @Author:lixuewei
 * @Date:2020/12/816:11
 */
public interface PosterDetailService {
    //创建帖子
    PosterDetail create(PosterDetail posterDetail);
    //删除帖子
    PosterDetail del(PosterDetail posterDetail);
    //修改帖子
    PosterDetail Alter(PosterDetail posterDetail,String topicContent);
    //根据user_id查询
    PosterDetail findByuserId(Integer userId);
    //根据帖子名称查询
    PosterDetail findBytopicType(String topicContent);



}
