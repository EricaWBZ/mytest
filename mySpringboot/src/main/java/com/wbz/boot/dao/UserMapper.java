package com.wbz.boot.dao;

import com.wbz.boot.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    List<User> findAll();


}
