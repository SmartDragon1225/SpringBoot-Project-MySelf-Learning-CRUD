package com.tian.springbootproject.service;

import com.tian.springbootproject.pojo.User;

import java.util.List;

public interface UserService {

    List<User> list();

    User selectById(int id);

    int add(User user);

    int delete(int id);

    int update(User user);
}
