package com.example.demo.service.impl;

import com.example.demo.dataoobject.PosterDetail;
import com.example.demo.dataoobject.User;
import com.example.demo.enums.ResultEnum;
import com.example.demo.exception.CommentException;
import com.example.demo.repository.PosterDetailRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.PosterDetailService;
import com.example.demo.service.UserService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @Author:lixuewei
 * @Date:2020/12/816:15
 */
@Service
@Data
public class PosterDetailServiceImpl implements PosterDetailService {
    @Autowired
    private PosterDetailRepository posterDetailRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;



    @Override
    public PosterDetail create(PosterDetail posterDetail) {
        //查询
        if(userService.findOne(posterDetail.getId())!=null){
            throw new CommentException(ResultEnum.USER_EXIST);
        }
        posterDetailRepository.save(posterDetail);

        return posterDetail;
    }

    @Override
    public PosterDetail del(PosterDetail posterDetail) {
        //查询
        if(userService.findOne(posterDetail.getId())!=null){
            throw new CommentException(ResultEnum.USER_EXIST);
        }
        if(posterDetailRepository.findByTopicContent(posterDetail.getTopicContent())==null){
            throw new CommentException(ResultEnum.TOPIC_NOT_EXIST);
        }

        posterDetailRepository.delete(posterDetail);
        return posterDetail;
    }

    @Override
    public PosterDetail Alter(PosterDetail posterDetail,String topicContent) {
        //查询
        if(userService.findOne(posterDetail.getId())!=null){
            throw new CommentException(ResultEnum.USER_EXIST);
        }
        if(posterDetailRepository.findByTopicContent(posterDetail.getTopicContent())==null){
            throw new CommentException(ResultEnum.TOPIC_NOT_EXIST);
        }

        posterDetail.setTopicContent(topicContent);
        return posterDetail;
    }

    @Override
    public PosterDetail findByuserId(Integer userId) {
        //findById 返回的是Optional 不会为空的。我回来看 取外卖
        Optional<PosterDetail> posterDetailOptional = posterDetailRepository.findById(userId);
        if (!posterDetailOptional.isPresent()) {
            throw new CommentException(ResultEnum.USER_NOT_EXIST);
        }

        if(posterDetailRepository.findById(userId)==null){
            throw new CommentException(ResultEnum.USER_NOT_EXIST);
        }
        return posterDetailRepository.findById(userId).get();
    }

    @Override
    public PosterDetail findBytopicType(String topicContent) {
        if(posterDetailRepository.findByTopicContent(topicContent)==null){
            throw new CommentException(ResultEnum.TOPIC_NOT_EXIST);
        }

        return posterDetailRepository.findByTopicContent(topicContent);
    }
}
