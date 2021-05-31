package com.tian.springbootproject.controller;

import com.tian.springbootproject.pojo.User;
import com.tian.springbootproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/user/list")
    public String list(Model model){
         List<User> users = userService.list();
         model.addAttribute("users",users);
         return "UserList";
    }

    //删除
    @RequestMapping("user/delete")
    public String delete(int id){
        userService.delete(id);
        return "redirect:/user/list";
    }

    //根据id查找
    @GetMapping(value = "user/find")
    public String find(int id, Model model) {
        User user = userService.selectById(id);
        model.addAttribute("emp", user);
        return "updateEmp";
    }

    //修改
    @PostMapping(value = "/user/update")
    public String update(User user) {
        userService.update(user);
        return "redirect:/user/list";
    }

    //添加用户
    @RequestMapping("user/add")
    public String add(User user){
        userService.add(user);
        return "redirect:/user/list";
    }
}
