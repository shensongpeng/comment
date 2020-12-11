package com.example.demo.service.impl;

import com.example.demo.dataoobject.Comment;
import com.example.demo.repository.CommentRepository;
import com.example.demo.service.CommentService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author:lixuewei
 * @Date:2020/12/816:15
 */
@Service
@Data
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentRepository commentRepository;

    @Override
    public Comment del(Comment comment) {
        return null;
    }

    @Override
    public Comment increase(Comment comment) {

        return null;
    }


}
