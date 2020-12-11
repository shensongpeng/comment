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
public class PosterDetail {
    /*
    *
    * id 主键',
    * topic_type 主题类型',
    * topic_content 帖子内容
    * user_id` 发帖人id',
    * post_time 发帖时间',
    * content_total 评论总数',
    * up_total 点赞总数'
    *update_time 更新时间
    * topic_name帖子名称
    * */
    @Id
    private Integer id;
    private String topicType;
    private String topicContent;
    private Integer userId;
    private Date postTime;
    private Integer contentTotal;
    private Integer upTotal;
    private Date updateTime;
}
