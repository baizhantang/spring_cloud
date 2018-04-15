package com.sunhao.eureka_zipkin_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import zipkin.server.EnableZipkinServer;
import zipkin.storage.mysql.MySQLStorage;

import javax.sql.DataSource;

@SpringBootApplication
@EnableEurekaClient
@EnableZipkinServer
public class EurekaZipkinClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaZipkinClientApplication.class, args);
    }

    @Bean
    public MySQLStorage mySQLStorage(DataSource dataSource) {
        return MySQLStorage.builder().datasource(dataSource).executor(Runnable::run).build();
    }
}
