package com.tian.springbootproject.service.impl;

import com.tian.springbootproject.mapper.LoginUserMapper;
import com.tian.springbootproject.pojo.User;
import com.tian.springbootproject.service.LoginUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginUserServiceimpl implements LoginUserService {

    @Autowired
    LoginUserMapper userMapper;

    @Override
    public User login(String username,String password) {
        return userMapper.login(username,password);
    }

}
