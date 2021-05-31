package com.tian.springbootproject.controller;

import com.tian.springbootproject.pojo.User;
import com.tian.springbootproject.service.LoginUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
//@RequestMapping("/user")
public class LoginUserController {

    @Autowired
    LoginUserService userService;

    @RequestMapping("login")
    public String login(@RequestParam("username") String username,@RequestParam("password") String password, HttpSession session){
        User login = userService.login(username,password);
        if(login != null){
            //重定向，避免视图重复跳转
            session.setAttribute("loginuser",username);
            return "redirect:/user/list";
        }else {
            return "redirect:index";
        }
    }
}
