package com.sunhao.eureka_ribbon_client.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String sayHiByRibbon() {
        return restTemplate.getForObject("http://eureka-common-client/hi", String.class);
    }

    public String hiError() {
        return "Sorry, this method has been hang!";
    }
}
