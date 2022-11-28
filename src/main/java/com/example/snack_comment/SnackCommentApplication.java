package com.example.snack_comment;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.snack_comment.mapper")
public class SnackCommentApplication {

    public static void main(String[] args) {
        SpringApplication.run(SnackCommentApplication.class, args);
    }

}
