package com.yxn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author yuanxinan
 * @date 2019/3/7
 **/

@EnableEurekaServer
@SpringBootApplication
public class Registry {
    public static void main(String[] args) {
        SpringApplication.run(Registry.class);
    }
}
