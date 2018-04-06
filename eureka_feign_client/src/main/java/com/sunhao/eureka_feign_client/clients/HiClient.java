package com.sunhao.eureka_feign_client.clients;

import com.sunhao.eureka_feign_client.handle_error.HiError;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "eureka-common-client", fallback = HiError.class)
public interface HiClient {

    @GetMapping("/hi")
    String sayHiByFeign();
}
