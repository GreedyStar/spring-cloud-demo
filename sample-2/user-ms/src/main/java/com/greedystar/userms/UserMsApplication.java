package com.greedystar.userms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Author GreedyStar
 * Date   2020-6-9
 */
@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class UserMsApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserMsApplication.class, args);
    }

}
