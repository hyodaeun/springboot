package com.sample.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication // 이 프로젝트를 실행했을 때 가장 먼저 실행됨을 지칭하는 어노테이션
public class Application {
    public static void main(String[] args) {
        // SpringApplication.run가 실행시키는 거임
        ApplicationContext ctx = SpringApplication.run(Application.class, args);
    }
}