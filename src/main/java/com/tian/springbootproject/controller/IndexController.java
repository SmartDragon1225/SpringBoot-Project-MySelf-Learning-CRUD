package com.tian.springbootproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping(value = "/index")
    public String toIndex() {
        return "login";
    }

    @GetMapping(value = "/add")
    public String toSave() {
        return "addEmp";
    }
}
