package com.example.demo.repository;

import com.example.demo.dataoobject.PosterDetail;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author:lixuewei
 * @Date:2020/12/815:51
 */
public interface PosterDetailRepository extends JpaRepository<PosterDetail,Integer> {
    PosterDetail findByTopicContent(String topicContent);
}
