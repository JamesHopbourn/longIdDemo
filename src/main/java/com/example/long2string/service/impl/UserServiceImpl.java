package com.example.long2string.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.long2string.entity.User;
import com.example.long2string.mapper.UserMapper;
import com.example.long2string.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
