package com.luxsong.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringBootCloudApplication8001 {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootCloudApplication8001.class,args);
    }
}
