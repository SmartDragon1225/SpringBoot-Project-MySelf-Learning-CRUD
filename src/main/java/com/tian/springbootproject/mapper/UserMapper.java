package com.tian.springbootproject.mapper;

import com.tian.springbootproject.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> list();

    User selectById(long id);

    int add(User user);

    int delete(int id);

    int update(User user);
}
