package com.greedystar.rolems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Author GreedyStar
 * Date   2020-6-9
 */
@EnableEurekaClient
@SpringBootApplication
public class RoleMsApplication {

    public static void main(String[] args) {
        SpringApplication.run(RoleMsApplication.class, args);
    }

}
