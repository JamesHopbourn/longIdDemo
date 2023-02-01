package com.example.long2string.web;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.example.long2string.common.resp.Result;
import com.example.long2string.entity.User;
import com.example.long2string.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping("get")
    public Result getOne(){
        LambdaQueryWrapper<User> userLambdaQueryWrapper = new LambdaQueryWrapper<>();
        userLambdaQueryWrapper.eq(User::getUserName, "hjd");
        return Result.ok(userService.getOne(userLambdaQueryWrapper));
    }

    @GetMapping()
    public Result get(){
        return Result.ok(userService.list());
    }

    @PostMapping()
    public Result modify(@RequestBody User user){
        boolean save = userService.save(user);
        return Result.ok("新增用户的 ID: " + user.getAdminId());
    }

    @PutMapping()
    public Result add(@RequestBody User user){
        LambdaUpdateWrapper<User> wrapper = new LambdaUpdateWrapper<>();
        wrapper.eq(User::getAdminId, user.getAdminId()).set(User::getUserName, user.getUserName());
        boolean save = userService.update(wrapper);
        return Result.ok(save);
    }

}
