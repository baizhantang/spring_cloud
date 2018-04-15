package com.sunhao.config_client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    @Value("${my.name}")
    private String name;

    @Value("${my.age}")
    private int age;

    @GetMapping("/getConfig")
    public String getConfig() {
        return "I'm " + name + ", and I'm " + age;
    }
}
