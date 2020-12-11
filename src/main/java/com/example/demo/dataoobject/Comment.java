package com.example.demo.dataoobject;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * @Author:lixuewei
 * @Date:2020/12/814:44
 */
@Data
@Entity
@DynamicInsert
@DynamicUpdate
public class Comment {
    @Id
    private Integer id;

    private Integer commentId;

    private Integer replyId;

    private String content;

    private Integer fromId;

    private Integer userId;

    private Date createTime;

    private Date updateTime;

    private Integer upTotal;

}
