package com.example.long2string.web;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.example.long2string.entity.User;
import com.example.long2string.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping("get")
    public User getOne(){
        LambdaQueryWrapper<User> userLambdaQueryWrapper = new LambdaQueryWrapper<>();
        userLambdaQueryWrapper.eq(User::getUserName, "hjd");
        return userService.getOne(userLambdaQueryWrapper);
    }

    @GetMapping()
    public List<User> get(){
        return userService.list();
    }

    @PostMapping()
    public String modify(@RequestBody User user){
        boolean save = userService.save(user);
        return "新增用户的 ID: " + user.getAdminId();
    }

    @PutMapping()
    public boolean add(@RequestBody User user){
        LambdaUpdateWrapper<User> wrapper = new LambdaUpdateWrapper<>();
        wrapper.eq(User::getAdminId, user.getAdminId()).set(User::getUserName, user.getUserName());
        boolean save = userService.update(wrapper);
        return save;
    }

}
