package com.group8.yugui.service;

import com.group8.yugui.domain.User;

/**
 * Created by ZhangMh on 2018/9/8.
 */
public interface UserService {
    
    User getUser(String userID);
    
    User getUser(String userID, String password);
    
    //更改个人资料
    boolean updateUser(User user);

    //注册
    boolean insertSign(User user);
    
    //修改密码前查看密码是否正确
    boolean passwordOr(User user);
    
    //更改密码
    boolean updateSign(User user);
    
    //账号是否已经存在
    boolean existOr(String userID);
    
}
