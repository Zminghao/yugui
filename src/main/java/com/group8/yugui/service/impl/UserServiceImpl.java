package com.group8.yugui.service.impl;

import com.group8.yugui.domain.User;
import com.group8.yugui.persistance.UserMapper;
import com.group8.yugui.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ZhangMh on 2018/9/8.
 */
@Service("UserService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    
    @Override
    public User getUser(String userID) {
        return userMapper.getUserById(userID);
    }

    //登陆
    @Override
    public User getUser(String userID, String password) {
        User user = new User();
        user.setUserID(userID);
        user.setPassword(password);
        return userMapper.getUserByIdAndPassword(user);
    }

    @Override
    public boolean existOr(String userID) {
        boolean state;
        if (userMapper.existOr(userID) == null || userMapper.existOr(userID) == ""){
            state = false;
        } else {
            state =true;
        }
        return state;
    }

    //注册用户
    @Override
    public boolean insertSign(User user) {
        boolean state;
        try {
            userMapper.insertSignon(user);
            state = true;
        } catch (Exception e){
            state = false;
        }
        userMapper.insertUser(user);
        return state;
    }

    @Override
    public boolean passwordOr(User user){
        boolean state;
        if (userMapper.passwordOr(user).equals(user.getPassword())){
            state = true;
        } else {
            state = false;
        }
        return state;
    }
    
    //更改密码
    @Override
    public boolean updateSign(User user) {
        boolean state;
        try {
            userMapper.updateSignon(user);
            state = true;
        } catch (Exception e){
            state = false;
        }
        return state;
    }
    
    //设置个人信息
    @Override
    public boolean updateUser(User user) {
        boolean state;
        try {
            userMapper.updateUser(user);
            state = true;
        } catch (Exception e){
            state = false;
        }
        return state;
    }
    
}
