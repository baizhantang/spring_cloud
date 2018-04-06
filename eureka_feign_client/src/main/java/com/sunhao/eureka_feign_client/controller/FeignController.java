package com.sunhao.eureka_feign_client.controller;

import com.sunhao.eureka_feign_client.clients.HiClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @Autowired
    private HiClient hiClient;

    @GetMapping("/sayHiByFeign")
    public String sayHiByFeign() {
        return hiClient.sayHiByFeign();
    }
}
