package com.chixing;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.chixing.mapper")
public class SpringbootDemo1Application {

    public static void main(String[] args) {

        SpringApplication.run(SpringbootDemo1Application.class, args);
    }

}
