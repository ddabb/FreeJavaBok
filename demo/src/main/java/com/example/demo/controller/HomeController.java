package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    public StudentProperties studentProperties;
    @Value("${projectName}")
    public String projectName;

    @RequestMapping("/")
    public String home() {
        return "获取全局配置参数:" + studentProperties.getId() + studentProperties.getName() + studentProperties.getAge();

    }

    @RequestMapping("/sub")
    public String Sub() {
        return "路由是否正常";
    }
}
