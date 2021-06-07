package com.wbz.boot;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wbz.boot.dao.UserMapper;
import com.wbz.boot.pojo.MyProfile;
import com.wbz.boot.pojo.MyProfile01;
import com.wbz.boot.pojo.PageParams;
import com.wbz.boot.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;

@SpringBootTest
class MySpringbootApplicationTests {

    @Autowired
    MyProfile myProfile;

    @Autowired
    MyProfile01 myProfile01;

    @Autowired
    Environment env;

    @Autowired
    UserMapper userMapper;

    @Autowired
    PageParams pageParams;

    @Test
    void contextLoads01() {
        System.out.println("===========1============");
        System.out.println(myProfile);
    }

    @Test
    void contextLoads02() {
        System.out.println("===========2============");
        System.out.println(myProfile01);
    }

    @Test
    void contextLoads03() {
        System.out.println("===========3============");
        System.out.println(env.getProperty("my-profile.name"));
        System.out.println(env.getProperty("my-profile01.name01"));
    }

    //pagehelper分页插件的使用
    @Test
    void contextLoads04() {
        System.out.println("===========4============");
        pageParams.setPageNum(2);
        pageParams.setPageSize(3);

        //分页方式一(推荐)：
        PageInfo<User> userpageInfo = PageHelper.startPage(pageParams).doSelectPageInfo(() -> userMapper.findAll());

        for (User user : userpageInfo.getList()) {
            System.out.println(user);
        }


        /*
        //分页方式二：
        //静态分页
        PageHelper.startPage(pageParams);
        //分页查询
        PageInfo<User> userPageInfo = new PageInfo<>(userMapper.findAll());
        for (User user : userPageInfo.getList()) {
            System.out.println(user);
        }
        */
    }
}
