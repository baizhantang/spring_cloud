package com.sunhao.eureka_common_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaCommonClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaCommonClientApplication.class, args);
    }
}
