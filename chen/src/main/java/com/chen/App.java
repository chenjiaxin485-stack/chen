package com.chen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication // 1. 告诉 Spring Boot 这是启动类
@RestController      // 2. 标记这是一个 Web 控制器
public class App {

    public static void main(String[] args) {
        // 3. 使用 Spring Boot 的方式启动，而不是直接打印 Hello World
        SpringApplication.run(App.class, args);
    }

    // 4. 添加一个简单的接口测试是否启动成功
    @GetMapping("/")
    public String hello() {
        return "Hello! Spring Boot is running.";
    }
}
