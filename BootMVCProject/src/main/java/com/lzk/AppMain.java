package com.lzk;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lzk.dao")
public class AppMain {
    public static void main(String[] args) {
        SpringApplication.run(AppMain.class);
    }
}
