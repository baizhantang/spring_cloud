package com.sunhao.eureka_feign_client.handle_error;

import com.sunhao.eureka_feign_client.clients.HiClient;
import org.springframework.stereotype.Component;

@Component
public class HiError implements HiClient {

    @Override
    public String sayHiByFeign() {
        return "Sorry, this method has been hang!";
    }
}
