package com.wbz.boot.service;

import com.wbz.boot.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<User> findAll();
}
