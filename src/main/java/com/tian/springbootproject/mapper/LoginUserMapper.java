package com.tian.springbootproject.mapper;

import com.tian.springbootproject.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import javax.jws.soap.SOAPBinding;

@Mapper
public interface LoginUserMapper {
    //登录
    User login(@Param("username") String username, @Param("password") String password);
}
