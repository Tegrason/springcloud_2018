package com.luxsong.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.luxsong.springcloud"})
@ComponentScan("com.luxsong.springcloud")
public class SpringBootConsumerApplication_feign {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootConsumerApplication_feign.class,args);
    }
}
