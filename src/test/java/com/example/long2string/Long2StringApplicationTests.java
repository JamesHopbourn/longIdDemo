package com.example.long2string;

import com.example.long2string.entity.User;
import com.example.long2string.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class Long2StringApplicationTests {
    @Resource
    private UserMapper userMapper;

    @Test
    void contextLoads() {
        User user = new User();
        user.setUserName("James");
        userMapper.insert(user);
    }

}
