package com.jiyun.day03;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.jiyun.day03.dao")
public class Day03Application {

    public static void main(String[] args) {
        SpringApplication.run(Day03Application.class, args);
    }

}
