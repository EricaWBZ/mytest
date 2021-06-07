package com.wbz.boot.service.impl;

import com.wbz.boot.dao.UserMapper;
import com.wbz.boot.pojo.User;
import com.wbz.boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}
