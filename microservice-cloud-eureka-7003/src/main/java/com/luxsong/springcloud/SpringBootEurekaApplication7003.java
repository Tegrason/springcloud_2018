package com.luxsong.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringBootEurekaApplication7003 {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootEurekaApplication7003.class,args);
    }
}
