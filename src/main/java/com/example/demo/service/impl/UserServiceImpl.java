package com.example.demo.service.impl;

import com.example.demo.dataoobject.User;
import com.example.demo.enums.ResultEnum;
import com.example.demo.exception.CommentException;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @Author:lixuewei
 * @Date:2020/12/816:04
 */
//这里加上Service注解
@Service
@Data
public class UserServiceImpl implements UserService {
    //声明userRepository 然后使用自动注入的注解
    //userRepository是操作数据库的
    @Autowired
    private UserRepository userRepository;

    //这不能这么写吧  你现在就是再写userService这个service的实现类呢。
    //@Autowired
    //private UserService userService;

    @Override
    public User AlterPassword(Integer id, String password) {
        User user = findOne(id);
        if(user.getPassword() == password){
            throw new CommentException(ResultEnum.PASSWORD_IDENTICAL);
        }
        user.setPassword(password);
        userRepository.save(user);

        return user;
    }

    @Override
    public User AlterName(Integer id, String name) {
        User user = findOne(id);
        if(user.getName() == name){
            throw new CommentException(ResultEnum.NAME_IDENTICAL);
        }
        //TODO 循环判断是否有name，如果有则抛出异常
        // 根据name查一个。有结果就是重了


        if(userRepository.findAll(Example.of(new User(name)))!=null){
            throw new CommentException(ResultEnum.DUPLICATE_SERNAME);
        }
//        List<User> results = userRepository.findAll(Example.of(new User(name)));
//        Iterator<User> iterator = results.iterator();
//        while(iterator.hasNext()) {
//            User result = iterator.next();
//            //下面就是一些操作
//        }
//        for (User result;iterator.hasNext();result=iterator.next()) {
//            //这个就是上面for的实际代码
//        }
//        for (User result: results) {
//            //懂了吗
//            // results 是一个存储User的一个集合    :ji
//            System.out.println(result);
//        }
        user.setName(name);
        userRepository.save(user);
        return user;
    }

    @Override
    public User Delete(User user) {
        //这里就不用判断null了
        // 这个findOne已经做了判断

        userRepository.delete(user);
        return user;
    }

    @Override
    public User create(User user) {
        //1.查询
        if(findOne(user.getId()) != null){
            throw new CommentException(ResultEnum.USER_EXIST);
        }
        //2.save
        userRepository.save(user);
        return user;
    }

    @Override
    public void login(Integer id,String password) {
        //登录的时候需要验证登录人id跟password是否匹配
        Optional<User> user = userRepository.findById(id);
        if(user.get().getPassword() != password){
            throw new CommentException(ResultEnum.PASSWORD_ERROR);
        }
        //TODO

    }

    @Override
    public User findOne(Integer id) {
        //这里不就是根据id查询嘛，我们用下他就好了。
        Optional<User> userOptional = userRepository.findById(id);
        if ( !userOptional.isPresent()) {
            throw new CommentException(ResultEnum.USER_NOT_EXIST);
        }
        return userOptional.get();
    }


}
