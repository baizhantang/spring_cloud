package com.sunhao.eureka_common_client.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class CommonService {

    @Value("${server.port}")
    private int port;

    public String sayHi() {
        return "hi, I'm from the port " + port;
    }
}
