package com.group8.yugui.controller;

import com.group8.yugui.domain.User;
import com.group8.yugui.model.UserModel;
import com.group8.yugui.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ZhangMh on 2018/9/8.
 */

@RestController
@CrossOrigin
@RequestMapping(value = "/user")
public class UserController {
     
    @Autowired
    private UserService userService;
    
    @PostMapping("/signOn")
    public User signOn(@RequestBody UserModel userModel){
        User user = new User();
        user.setUserID(userModel.getUserID());
        System.out.println(user.getUserID());
        user.setPassword(userModel.getPassword());
        System.out.println(user.getPassword());
        //session.setAttribute("user", userService.getUser(user.getUserID(), user.getPassword()));
        //System.out.println(session.getId());
        return userService.getUser(user.getUserID(), user.getPassword());
    }
    
    @GetMapping("/sign/{userID}")
    public User sign(@PathVariable("userID") String userID){
        User user = new User();
        /*if (session == null || session.getAttribute("user") == null){
            System.out.println(session.getId());
            System.out.println(session.getAttribute("user"));
            user = null;
        } else {
            user = (User)session.getAttribute("user");
        }*/
        return userService.getUser(userID);
    }
    
    @PostMapping("/existOr")
    public Boolean existOr(@RequestBody UserModel userModel){
        User user = new User();
        user.setUserID(userModel.getUserID());
        return userService.existOr(user.getUserID());
    }
    
    @PostMapping("/insertSign")
    public Boolean insertSign(@RequestBody UserModel userModel){
        User user = new User();
        user.setUserID(userModel.getUserID());
        user.setPassword(userModel.getPassword());
        return userService.insertSign(user);
    }
    
    @PostMapping("/passwordOr")
    public Boolean passwordOr(@RequestBody UserModel userModel,HttpSession session){
        User user = (User)session.getAttribute("user");
        //User user = new User();
        //user.setUserID("1");
        user.setPassword(userModel.getPassword());
        return userService.passwordOr(user);
    }
    
    @PostMapping("/updateSign")
    public Boolean updateSign(@RequestBody UserModel userModel/*,HttpSession session*/){
        User user = new User();//(User)session.getAttribute("user");
        //User user = new User();
        //user.setUserID("1");
        user.setPassword(userModel.getPassword());
        /*if (userService.updateSign(user)){
            session.setAttribute("user", user);
        }*/
        return userService.updateSign(user);
    }

    @PostMapping("/getdateUser")
    public User getdateUser(@RequestBody String userID){
        return userService.getUser(userID);
    }

    @PostMapping("/updateUser")
    public User updateUser(@RequestBody UserModel userModel/*,HttpSession session*/){
        User user = new User();//(User)session.getAttribute("user");
        //User user = new User();
        //user.setUserID("1");
        user.setName(userModel.getUsername());
        user.setPlace(userModel.getPlace());
        user.setAge(userModel.getAge());
        user.setPhone(userModel.getPhone());
        user.setSex(userModel.getSex());
        user.setDescription(userModel.getDescription());
        /*if (userService.updateUser(user)){
            session.setAttribute("user", user);
        } else {
            user.equals(null);
        }*/
        userService.updateUser(user);
        return user;
    }
    
    @GetMapping("/test")
    public Map<String, String> test(){
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("msg", "测试");
        return hashMap;
    }
    
}
