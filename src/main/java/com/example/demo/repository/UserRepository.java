package com.example.demo.repository;

import com.example.demo.dataoobject.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author:lixuewei
 * @Date:2020/12/815:52
 */
public interface UserRepository extends JpaRepository<User,Integer>{
}
