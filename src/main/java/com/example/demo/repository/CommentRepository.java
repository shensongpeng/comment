package com.example.demo.repository;

import com.example.demo.dataoobject.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author:lixuewei
 * @Date:2020/12/815:24
 */
public interface CommentRepository extends JpaRepository<Comment,Integer> {
}
