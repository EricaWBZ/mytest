package com.wbz.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.wbz.boot.dao")
public class MySpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(MySpringbootApplication.class, args);

        /*
        //改变默认配置文件application.yml的名称为aaa.yml
        new SpringApplicationBuilder(MySpringbootApplication.class)
                .properties("spring.config.name:aaa")     // "spring.config.name=aaa" 也可以
                .run(args);*/
    }
}
