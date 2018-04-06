package com.sunhao.eureka_ribbon_client.controller;

import com.sunhao.eureka_ribbon_client.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonController {

    @Autowired
    private RibbonService ribbonService;

    @GetMapping("sayHiByRibbon")
    public String sayHiByRibbon() {
        return ribbonService.sayHiByRibbon();
    }
}
