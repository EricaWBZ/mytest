package com.wbz.boot.controller;

import com.wbz.boot.pojo.User;
import com.wbz.boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    Environment env;

    @GetMapping("/findAll")
    public List<User> findAll() {
        System.out.println(env.getProperty("my-profile.name"));
        return userService.findAll();
    }
}
