package com.tian.springbootproject.service;

import com.tian.springbootproject.pojo.User;

public interface LoginUserService {

    User login(String username,String password);
}
