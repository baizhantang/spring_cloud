package com.sunhao.eureka_common_client.controller;

import com.sunhao.eureka_common_client.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {

    @Autowired
    private CommonService commonService;

    @GetMapping("/hi")
    public String sayHi() {
        return commonService.sayHi();
    }
}
