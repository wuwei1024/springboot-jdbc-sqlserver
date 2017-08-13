package com.wuwei;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBoot入口程序
 *
 * @author Wu Wei
 * @date 2017-8-5 14:04:37
 */
@SpringBootApplication
@MapperScan(basePackages = "com.wuwei.dao")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
