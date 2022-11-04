package com.wiseinc.dataIn.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class dataInEurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(dataInEurekaServerApplication.class, args);
    }
}
