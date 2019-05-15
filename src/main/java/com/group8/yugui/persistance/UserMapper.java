package com.group8.yugui.persistance;

import com.group8.yugui.domain.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by ZhangMh on 2018/9/8.
 */
@Mapper
public interface UserMapper {
    
    User getUserById(String userID);
    
    User getUserByIdAndPassword(User user);
    
    String existOr(String userID);

    String passwordOr(User user);
    
    boolean insertSignon(User user);
    
    boolean updateUser(User user);
    
    boolean insertUser(User user);
    
    boolean updateSignon(User user);
    
}
